package com.adonetwork.jiraboot.adapters;

import java.util.List;

import com.adonetwork.jiraboot.core.Project;
import com.adonetwork.jiraboot.external.ProjectRepository;
import com.adonetwork.jiraboot.ports.ProjectPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 
@Service
public class ProjectAdapter implements ProjectPort {
    /**
     * Adaptateur pour la gestion des projets JIRA
     */
    
    // Liste des repositories de la librairie
    @Autowired
    private ProjectRepository myProjectRepository; // Repository pour la gestion des projets JIRA

    // Méthodes de l'adaptateur
    @Override
    public List<Project> getAllProjects() {
        // Implémentation de la méthode pour récupérer tous les projets JIRA
        return null; // Remplacer par la logique réelle
    }

}
