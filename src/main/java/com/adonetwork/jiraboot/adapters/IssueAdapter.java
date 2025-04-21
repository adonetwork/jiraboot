package com.adonetwork.jiraboot.adapters;


import com.adonetwork.jiraboot.external.IssueRepository;
import com.adonetwork.jiraboot.ports.IssuePort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Slf4j
@Service
public class IssueAdapter implements IssuePort {
    /**
     * Adaptateur pour la gestion des tickets JIRA
     * @author AdoNetwork
     */
    
    // Liste des repositories de la librairie
    @Autowired
    private IssueRepository myIssueRepository; // Repository pour la gestion des tickets JIRA

    // Méthodes de l'adaptateur
   

}
