package com.adonetwork.jiraboot.core;


import java.util.List;

import lombok.*;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Data
public class IssuesHierarchy {
    /**
     * DTO représentant la hierarchie des types de tickets JIRA sur un projet
     *  @author AdoNetwork
     */

    // Hierchie des types de tickets
    private List<IssueTypeList> hierarchy;  
}
