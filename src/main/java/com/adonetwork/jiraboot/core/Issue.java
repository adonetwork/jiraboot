package com.adonetwork.jiraboot.core;

import java.util.List;

import lombok.Data;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Data
public class Issue {
    /**
     * DTO représentant un ticket JIRA
     * @author AdoNetwork
     */

    // Liste des membres
    private String id; // Identifiant du ticket
    private String key; // Clé du ticket
    private List<Field> fields; // Liste des champs du ticket

}
