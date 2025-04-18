package com.adonetwork.jiraboot.external;

import lombok.Data;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Data
public class JiraErrorMessage {
    /**
     * La DTO contenant le message d'erreur JIRA
     * @author AdoNetwork
     */

    // Membres
    private String message;

    // Constructeur
    public JiraErrorMessage(String msg) {
        this.message = msg;
    }
}
