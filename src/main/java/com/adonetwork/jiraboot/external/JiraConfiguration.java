package com.adonetwork.jiraboot.external;

import org.springframework.context.annotation.Configuration;

import java.net.InetSocketAddress;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import java.net.Proxy;
import java.net.InetAddress;
import feign.Client;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;

/*
* Jiraboot - Libriairie d'accès à l'API REST de JIRA
* Copyright 2025 - AdoNetwork tous droits réservés. 
*/ 

@Configuration
public class JiraConfiguration {
    /**
     * Classe de configuration d'accès à l'API REST de JIRA.
     *  @author AdoNetwork
     */

     @Value("${jira.login}")
     private String login; // Identifiant de connexion à l'API JIRA

     @Value("${jira.token}")
     private String token; // Jeton d'authentification à l'API JIRA

     @Value("${jira.proxy.host}")
     private String host; // Serveur proxy. 

     @Value("${jira.proxy.port}")
     private int port; // port d'écoute du serveur proxy

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
         return new BasicAuthRequestInterceptor(login, token);
    }

    @Bean
    public Client feignClient() {
      return new Client.Proxied(null, null, 
                 new Proxy(Proxy.Type.HTTP,
                     new InetSocketAddress(host, port)));
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new JiraErrorDecoder();
    }

}
