package com.adonetwork.jiraboot.core;

import java.util.List;
import lombok.*;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Data
public class ProjectList {
    /**
     * DTO représentant la liste des projets JIRA
     *  @author AdoNetwork
     */

    // Liste des projets JIRA
    private List<Project> values; // Liste des projets JIRA

}
