package com.adonetwork.jiraboot.core;

import lombok.*;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/

@Data
public class Status {
    /**
     * DTO représentant le statut d'un ticket JIRA
     * @author AdoNetwork
     */

    // Membres de la classe.
    private String id; // Identifiant du statut
    private String name; // Nom du statut   
    private String statusCategory; // Catégorie du statut
}

