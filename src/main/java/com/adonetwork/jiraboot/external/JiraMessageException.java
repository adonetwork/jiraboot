package com.adonetwork.jiraboot.external;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Setter
@Getter
public class JiraMessageException extends Exception {
    private static final long serialVersionUID = 1L;
    
    // membres
    private int errorCode; // Code de l'erreur HTTP. 
    private String errorName; // Cause de l'erreur.
    private List<JiraErrorMessage> errorMessages; // Messages d'erreur renvoyés par l'API JIRA.
    
    // Constructors
    public JiraMessageException() {
        super();
    }

    


}
