package com.adonetwork.jiraboot.external;

import org.springframework.stereotype.Repository; 
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import com.adonetwork.jiraboot.core.Issue;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 
@Repository
@FeignClient(value = "${issue.feign.config.name}", url = "${jira.feign.config.url}",configuration = JiraConfiguration.class)
public interface IssueRepository {
    /**
     * Classe d'accès aux données pour la gestion des tickets JIRA.
     * @author AdoNetwork
     */

    // Liste des endpoints de l'API REST de JIRA
    @PostMapping(value="/issue", consumes = MediaType.APPLICATION_JSON_VALUE)
    void createIssue(Issue myIssue) throws JiraMessageException;
}