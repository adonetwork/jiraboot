package com.adonetwork.jiraboot.external;

import lombok.extern.slf4j.Slf4j;
import feign.RequestInterceptor;
import feign.RequestTemplate;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Slf4j
public class ApiKeyRequestInterceptor implements RequestInterceptor {
    
    private final String apiKey;
    
    public ApiKeyRequestInterceptor(String apiKey) {
        this.apiKey = apiKey;
    }
    
    @Override
    public void apply(RequestTemplate template) {
        log.info("Adding API key to request");
        template.header("X-API-Key", apiKey);
    }

}
