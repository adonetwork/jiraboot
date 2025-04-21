package com.adonetwork.jiraboot.core;

import lombok.*;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/

@Data
public class Priority {
    /**
     * DTO représentant la priorité d'un ticket JIRA
     * @author AdoNetwork
     */

    // Membres de la classe.
    private String id; // Identifiant de la priorité
    private String name; // Nom de la priorité      
    private String description; // Description de la priorité
}

