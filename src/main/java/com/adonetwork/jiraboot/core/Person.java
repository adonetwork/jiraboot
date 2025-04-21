package com.adonetwork.jiraboot.core;

import lombok.*;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/

@Data
public class Person {
    /**
     * DTO représentant un utilisateur JIRA
     * @author AdoNetwork
     */

    // Membres de la classe.
    private String emailAddress; // Adresse email de l'utilisateur
    private String displayName; // Nom d'affichage de l'utilisateur 
    private String accountId; // Identifiant de compte de l'utilisateur
}

