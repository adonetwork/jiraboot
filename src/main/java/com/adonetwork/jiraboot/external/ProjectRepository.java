package com.adonetwork.jiraboot.external;

import org.springframework.stereotype.Repository; 
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.adonetwork.jiraboot.core.IssuesHierarchy;
import com.adonetwork.jiraboot.core.Project;
import com.adonetwork.jiraboot.core.ProjectList;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 
@Repository
@FeignClient(value = "${project.feign.config.name}", url = "${jira.feign.config.url}",configuration = JiraConfiguration.class)
public interface ProjectRepository {
    /**
     * Classe d'accès aux données pour la gestion des projets JIRA.
     * @author AdoNetwork
     */

    // Liste des endpoints de l'API REST de JIRA
    @GetMapping(value="/project/search", consumes = MediaType.APPLICATION_JSON_VALUE)
    ProjectList getAllProjects() throws JiraMessageException;

    @GetMapping(value="/project/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    Project getProjectById(@PathVariable String id) throws JiraMessageException;

    @GetMapping(value="/project/{id}/hierarchy", consumes = MediaType.APPLICATION_JSON_VALUE)
    IssuesHierarchy getIssueTypesByProjectId(@PathVariable String id) throws JiraMessageException;
}