package com.adonetwork.jiraboot.external;

import java.io.IOException;
import java.io.InputStream;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Slf4j
public class JiraErrorDecoder implements ErrorDecoder{

    /**
     * Decode les messages d'erreurs retournés pas l'API JIRA
     * @author AdoNetwork
     */

     @Override
     public Exception decode(String methodKey, Response response) {
        
        JiraMessageException jsonObject = null;

        try {
            // Traitement de la réponse
            log.error("Initialisation d'une exception suite à un retour de l'API : " + response.status());
            log.error("Message d'erreur rencontré : " + response.reason());
    
            // Vérifier si le corps de la réponse est présent
            if (response.body() != null) {
                // Lire le corps de la réponse en tant que flux
                InputStream bodyStream = response.body().asInputStream();
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    
                // Convertir le corps en objet JSON (classe JiraMessageException)
                jsonObject = objectMapper.readValue(bodyStream, JiraMessageException.class);
    
                // Afficher le nombre d'erreurs retournés
                log.error("Messages d'erreur retournés : {}", jsonObject.getErrorMessages().size());

                // Alimentation de l'exception
                jsonObject.setErrorCode(response.status());
                switch (response.status()){
                    case 400:
                        jsonObject.setErrorName("La syntaxe de la requête est erronée.");
                    case 401:
                        jsonObject.setErrorName( "Une authentification est nécessaire pour accéder à la ressource."); 
                    case 404:
                        jsonObject.setErrorName( "Ressource non trouvée."); 
                    default:
                        jsonObject.setErrorName("Erreur interne du serveur"); 
                }

            }
        } catch (IOException e) {
            log.error("Erreur lors de la lecture du corps de la réponse : ", e);
        }

        return jsonObject;
        
     }



}
