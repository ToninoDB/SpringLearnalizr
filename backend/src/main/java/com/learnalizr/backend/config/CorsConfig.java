package com.learnalizr.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        // Permetti richieste solo da localhost:4200 (Angular)
        corsConfiguration.setAllowedOrigins(List.of("http://localhost:4200"));

        // Metodi HTTP consentiti
        corsConfiguration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));

        // Permetti tutti gli header
        corsConfiguration.setAllowedHeaders(List.of("*"));

        // Consenti autenticazione (es. cookie, sessione)
        corsConfiguration.setAllowCredentials(true);

        // Registra la configurazione per tutte le rotte
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);

        return new CorsFilter(source);
    }
}
