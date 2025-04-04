package com.adonetwork.jiraboot.external;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean; 
import feign.Logger;
import feign.RequestInterceptor;
import com.adonetwork.jiraboot.external.ApiKeyRequestInterceptor;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Configuration
public class JiraConfiguration {
    /**
     * Classe de configuration d'accès à l'API REST de JIRA.
     */
    @Value("${api.key:demo-api-key}")
    private String apiKey;

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public RequestInterceptor apiKeyRequestInterceptor() {
        return new ApiKeyRequestInterceptor(apiKey);
    }

}
