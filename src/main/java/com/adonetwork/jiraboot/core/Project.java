package com.adonetwork.jiraboot.core;

import lombok.*;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/

@Getter
@Setter
public final class Project {
    /**
     * DTO représentant un projet JIRA
     */

     // Membres de la classe.
    private String key; // Identifiant du projet
    private String name; // Nom du projet
    private String description; // Description du projet
    
}

