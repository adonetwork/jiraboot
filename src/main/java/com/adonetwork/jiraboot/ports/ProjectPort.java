package com.adonetwork.jiraboot.ports;

import java.util.List;
import com.adonetwork.jiraboot.core.Project;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 
public interface ProjectPort {
    /**
     * Interface de port pour la gestion des projets JIRA
     */

    // Description de l'interface
    /**
     * Retourne une liste de tous les projets JIRA
     * @return une liste de projets JIRA
     */
    public List<Project> getAllProjects(); // Récupérer tous les projets

    /**
     * Retourne un projet JIRA par son identifiant
     * @param id l'identifiant du projet
     * @return le projet JIRA correspondant à l'identifiant
     */
    public Project getProjectById(String id); // Récupérer un projet par son identifiant

}
