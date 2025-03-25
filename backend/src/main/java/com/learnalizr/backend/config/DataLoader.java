package com.learnalizr.backend.config;

import java.util.List;

import org.springframework.stereotype.Component;

import com.learnalizr.backend.model.Capitolo;
import com.learnalizr.backend.model.Lezione;
import com.learnalizr.backend.repository.CapitoloRepository;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {
    private final CapitoloRepository capitoloRepository;

    public DataLoader(CapitoloRepository capitoloRepository) {
        this.capitoloRepository = capitoloRepository;
    }

    @PostConstruct
    public void loadData() {
        if (capitoloRepository.count() == 0) {
            // Creazione dei capitoli con le lezioni
            Capitolo intro = new Capitolo();
            intro.setTitolo("Introduzione a Spring");
            intro.setLezioni(List.of(
                    new Lezione("Cos'è Spring?", "Spring è un framework per Java che semplifica lo sviluppo.", intro,
                            null),
                    new Lezione("Perché usare Spring?", "Spring aiuta a scrivere codice più modulare e manutenibile.",
                            intro, null),
                    new Lezione("SpringBoot Initializr", "Spring Boot facilita la creazione di progetti Spring.", intro,
                            null)));

            Capitolo di = new Capitolo();
            di.setTitolo("Dependency Injection");
            di.setLezioni(List.of(
                    new Lezione("Cos'è la Dependency Injection?",
                            "La DI è un pattern che permette di gestire le dipendenze.", di, null),
                    new Lezione("Inversion of Control (IoC)", "Spring implementa IoC per gestire i bean.", di, null),
                    new Lezione("@Autowired", "Spring usa @Autowired per iniettare dipendenze automaticamente.", di,
                            null)));

            Capitolo mvc = new Capitolo();
            mvc.setTitolo("Spring MVC");
            mvc.setLezioni(List.of(
                    new Lezione("Cos'è Spring MVC?", "Spring MVC è un pattern per gestire richieste HTTP.", mvc, null),
                    new Lezione("Model-View-Controller", "Divide la logica in Model, View e Controller.", mvc, null),
                    new Lezione("Spring Controller", "Usiamo @Controller per gestire le richieste.", mvc, null)));

            Capitolo hibernate = new Capitolo();
            hibernate.setTitolo("Hibernate e JPA");
            hibernate.setLezioni(List.of(
                    new Lezione("Cos'è Hibernate?", "Hibernate è un ORM per interagire con database.", hibernate, null),
                    new Lezione("JPA e Hibernate", "JPA è una specifica, Hibernate è un'implementazione.", hibernate,
                            null),
                    new Lezione("Entity e Repository", "Definiamo entità e usiamo JpaRepository per accedere ai dati.",
                            hibernate, null)));

            Capitolo apiRest = new Capitolo();
            apiRest.setTitolo("API REST con Spring Boot");
            apiRest.setLezioni(List.of(
                    new Lezione("Cos'è un'API REST?", "Un'API REST permette di comunicare tra client e server.",
                            apiRest, null),
                    new Lezione("Spring REST Controller", "Usiamo @RestController per creare API.", apiRest, null),
                    new Lezione("Chiamate HTTP", "GET, POST, PUT, DELETE sono i metodi principali.", apiRest, null)));

            Capitolo security = new Capitolo();
            security.setTitolo("Spring Security");
            security.setLezioni(List.of(
                    new Lezione("Autenticazione e Autorizzazione", "Spring Security gestisce login e ruoli.", security,
                            null),
                    new Lezione("Configurazione di Base", "Spring Security può essere configurato facilmente.",
                            security, null),
                    new Lezione("JWT e OAuth2", "Spring Security supporta JWT e OAuth2 per autenticazione avanzata.",
                            security, null)));

            Capitolo tutorial = new Capitolo();
            tutorial.setTitolo("Tutorial: Creazione Progetto Spring Boot");
            tutorial.setLezioni(List.of(
                    new Lezione("Configurazione iniziale", "Usiamo Spring Initializr per generare il progetto.",
                            tutorial, null),
                    new Lezione("Struttura del Progetto", "Analizziamo i file generati automaticamente.", tutorial,
                            null),
                    new Lezione("Esecuzione e Test", "Compiliamo e testiamo il progetto con Postman.", tutorial,
                            null)));

            // Salviamo i capitoli con le relative lezioni
            capitoloRepository.saveAll(List.of(intro, di, mvc, hibernate, apiRest, security, tutorial));
        }
    }
}