package com.adonetwork.jiraboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableFeignClients("com.adonetwork.jiraboot.external")
public class JirabootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JirabootApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			log.info("Lancement de l'application Jiraboot");
			System.out.println("Let's inspect the beans provided by Spring Boot:");

		};
	}

}
