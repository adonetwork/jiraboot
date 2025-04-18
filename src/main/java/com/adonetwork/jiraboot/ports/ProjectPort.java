package com.adonetwork.jiraboot.ports;

import java.util.List;

import com.adonetwork.jiraboot.core.JiraBootException;
import com.adonetwork.jiraboot.core.Project;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 
public interface ProjectPort {
    /**
     * Interface de port pour la gestion des projets JIRA
     * @author AdoNetwork
     */

    // Description de l'interface
    /**
     * Retourne une liste de tous les projets JIRA
     * @return une liste de projets JIRA
     * @exception une instance de JiraBootException
     */
    public List<Project> getAllProjects() throws JiraBootException; // Récupérer tous les projets

    /**
     * Retourne un projet JIRA par son identifiant
     * @param id l'identifiant du projet
     * @return le projet JIRA correspondant à l'identifiant
     * @exception une instance de JiraBootException
     */
    public Project getProjectById(String id) throws JiraBootException; // Récupérer un projet par son identifiant

}
