package com.adonetwork.jiraboot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.adonetwork.jiraboot.core.IssueType;
import com.adonetwork.jiraboot.core.Project;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableFeignClients("com.adonetwork.jiraboot.external")
public class JirabootApplication {

	@Autowired
	private JiraService jiraService; // Service pour la gestion des accès à l'API JIRA

	public static void main(String[] args) {
		SpringApplication.run(JirabootApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			log.info("Lancement de l'application Jiraboot");

			System.out.println("Récupérer la liste des projets d'une instance Jira");
			List<Project> projects = this.jiraService.getAllProjects();
			System.out.println("Nombre de projets JIRA : " + projects.size());
			
			System.out.println("Récupérer les méta données d'un projet JIRA");
			Project project =this.jiraService.getProjectById("TST");
			if (project != null) {
				System.out.println("Project " +	project.getKey() + " : " + project.getName());
				System.out.println("Description : " + project.getDescription());
				System.out.println("URL : " + project.getUrl());
				System.out.println("Type : " + project.getType());
				System.out.println("URL du projet : " + project.getUrl());
				System.out.println("Categorie " + project.getCategory().getName() + " : " + project.getCategory().getDescription());
			}

			System.out.println("Récupérer les types de tickets d'un projet JIRA");
			List<IssueType> issueTypes = this.jiraService.getIssueTypesByProjectId(project.getId());
			System.out.println("Nombre de types de tickets : " + issueTypes.size());	
		};
	}

}
