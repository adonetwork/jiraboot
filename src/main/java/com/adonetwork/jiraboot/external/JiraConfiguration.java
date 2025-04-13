package com.adonetwork.jiraboot.external;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean; 
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Configuration
public class JiraConfiguration {
    /**
     * Classe de configuration d'accès à l'API REST de JIRA.
     *  @author AdoNetwork
     */

     @Value("${jira.login}")
     private String login; // Identifiant de connexion à l'API JIRA

     @Value("${jira.token}")
     private String token; // Jeton d'authentification à l'API JIRA

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
         return new BasicAuthRequestInterceptor(login, token);
    }

}
