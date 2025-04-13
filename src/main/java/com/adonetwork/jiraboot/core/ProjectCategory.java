package com.adonetwork.jiraboot.core;

import lombok.*;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/

@Data
public class ProjectCategory {
    /**
     * DTO représentant la cagtégorie d'un projet JIRA
     * @author AdoNetwork
     */

     // Membres de la classe.
    private String id; // Identifiant de la catégorie
    private String name; // Nom de la catégorie
    private String description; // Description de la catégorie
}
