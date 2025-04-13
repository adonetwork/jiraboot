package com.adonetwork.jiraboot.adapters;

import java.util.ArrayList;
import java.util.List;

import com.adonetwork.jiraboot.core.Project;
import com.adonetwork.jiraboot.external.ProjectRepository;
import com.adonetwork.jiraboot.ports.ProjectPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Slf4j
@Service
public class ProjectAdapter implements ProjectPort {
    /**
     * Adaptateur pour la gestion des projets JIRA
     * @author AdoNetwork
     */
    
    // Liste des repositories de la librairie
    @Autowired
    private ProjectRepository myProjectRepository; // Repository pour la gestion des projets JIRA

    // Méthodes de l'adaptateur
    @Override
    public List<Project> getAllProjects() {
        // Implémentation de la méthode pour récupérer tous les projets JIRA
        log.info("Récupération de la liste des projets d'une instance JIRA");
        return myProjectRepository.getAllProjects().getValues(); 
    }

    @Override       
    public Project getProjectById(String id) {
        // Implémentation de la méthode pour récupérer un projet JIRA par son identifiant
        log.info("Récupération d'un projet JIRA par l'identifiant : " + id);
        return myProjectRepository.getProjectById(id);
    }

}
