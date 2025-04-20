package com.adonetwork.jiraboot.core;

import java.util.List;

import lombok.*;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/

@Data
public class IssueTypeList {
    /**
     * DTO représentant une liste de types de tickets JIRA
     * @author AdoNetwork
     */

    // Liste de types de tickets
    private String level;
    private String name;
    private List<IssueType> issueTypes;  
    
}

