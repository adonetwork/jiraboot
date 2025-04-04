package com.adonetwork.jiraboot.external;

import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.adonetwork.jiraboot.external.JiraConfiguration;
import com.adonetwork.jiraboot.core.Project;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 
@Repository
@FeignClient(value = "projects",
  url = "https://jsonplaceholder.typicode.com/",
  configuration = JiraConfiguration.class)
public interface ProjectRepository {
    /**
     * Classe d'accès aux données pour la gestion des projets JIRA.
     */
    @GetMapping("/project")
    List<Project> getAllProjects();


}
