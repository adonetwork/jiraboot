package com.adonetwork.jiraboot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adonetwork.jiraboot.adapters.ProjectAdapter;
import com.adonetwork.jiraboot.core.Project;
import lombok.extern.slf4j.Slf4j;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Slf4j
@Service
public final class JiraService {
    /**
     * Classe de service pour les accès à l'API JIRA
     * @author AdoNetwork
     */

     @Autowired
     private ProjectAdapter myProjectAdapter; // Adaptateur pour la gestion des projets JIRA

     // Liste des services applicatifs
     /**
      * Service de récupération des projets d'une instance JIRA
      * @return une liste de projets
      */
    public List<Project> getAllProjects() {
        // Implémentation de la méthode pour récupérer tous les projets JIRA
        log.info("Service de récupération de la liste des projets d'une instance JIRA");
        return myProjectAdapter.getAllProjects(); 
    }

    /**
     * Service de récupération d'un projet JIRA par son identifiant
     * @param id l'identifiant du projet
     * @return le projet JIRA correspondant à l'identifiant
     */
    public Project getProjectById(String id) {
        // Implémentation de la méthode pour récupérer un projet JIRA par son identifiant
        log.info("Service de récupération d'un projet JIRA par l'identifiant : " + id);
        return myProjectAdapter.getProjectById(id);
    }
    
}
