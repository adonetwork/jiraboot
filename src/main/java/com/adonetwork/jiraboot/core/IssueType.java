package com.adonetwork.jiraboot.core;

import lombok.*;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/

@Data
public class IssueType {
    /**
     * DTO représentant un type de ticket JIRA
     * @author AdoNetwork
     */

     // Membres de la classe.
     private String id; // Identifiant du type de ticket
     private String name; // Nom du type de ticket
    
}

