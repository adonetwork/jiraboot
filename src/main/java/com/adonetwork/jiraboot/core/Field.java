package com.adonetwork.jiraboot.core;


import lombok.Data;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Data
public class Field {
    /**
     * DTO représentant un champ d'un ticket JIRA
     * @author AdoNetwork
     */

    // Liste des membres
    private String summary; // Résumé d'une demande
    private Project project; // Projet associé à la demande
    private IssueType issuetype; // Type de la demande
    private String description; // Description de la demande
    private Person assignee; // Personne assignée à la demande
    private Person reporter; // Personne qui a rapporté la demande
    private String creator; // Personne qui a créé la demande
    private Priority priority; // Priorité de la demande
    private Status status; // Statut de la demande
}
