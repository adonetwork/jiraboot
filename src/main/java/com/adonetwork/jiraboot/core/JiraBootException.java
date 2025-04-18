package com.adonetwork.jiraboot.core;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/

@Slf4j
@Data
public class JiraBootException extends Exception {
    /*
     * Exception JiraBootException
     * Exception transmise sur tout erreur remontée par le framework
     */

    // Membres
    private String name; // La cause de l'erreur
    private String messages; // Les messages d'erreurs

    // constructeur
    public JiraBootException() {
        super();
    }

}
