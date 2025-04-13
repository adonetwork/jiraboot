package com.adonetwork.jiraboot.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/

@Data
public class Project {
    /**
     * DTO représentant un projet JIRA
     * @author AdoNetwork
     */

     // Membres de la classe.
    private String key; // Identifiant du projet
    private String name; // Nom du projet
    private String description; // Description du projet
    private String assigneeType; // Type d'assignation du projet
    @JsonProperty ("projectTypeKey")
    private String type; // Nature du projet
    private String url; // URL du projet
    @JsonProperty ("projectCategory")
    private ProjectCategory category; // Catégorie du projet
}

