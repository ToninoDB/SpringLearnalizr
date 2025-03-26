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
                        intro.setDescrizione("Questo capitolo introduce il framework Spring, spiegando cos'è, perché utilizzarlo e come Spring Boot semplifica lo sviluppo.");
                        intro.setLezioni(List.of(
                                        new Lezione("Cos'è Spring?",
                                                        "Spring è un framework open source che semplifica lo sviluppo di applicazioni JAVA Enterprise.\r\n",
                                                        intro, null),
                                        new Lezione("Perché usare Spring?",
                                                        "Spring aiuta a scrivere codice più modulare e manutenibile. Esso viene impiegato per lo sviluppo di progetti che fanno parte della famiglia Enterprise.\r\n"
                                                                        +
                                                                        "Il punto di forza di Spring è dato dalla gestione dei componenti tramite container. Il container è un’area di memoria condivisa che si occupa di effettuare a runtime\r\n"
                                                                        +
                                                                        "l’injection di codice necessario per garantire la gestione delle dipendenze.\r\n",
                                                        intro, null),
                                        new Lezione("SpringBoot",
                                                        "Spring Boot è un framework basato su Java open source utilizzato per creare microservizi e ridurre la complessità di configurazione di nuovi progetti Spring.\r\n"
                                                                        +
                                                                        "Spring Boot definisce una configurazione di base che include le linee guida per l'uso del framework e tutte le librerie di terze parti rilevanti,\r\n"
                                                                        +
                                                                        "semplificando la creazione di applicazioni indipendenti.\r\n",
                                                        intro, null)));

                        Capitolo di = new Capitolo();
                        di.setTitolo("Dependency Injection");
                        di.setDescrizione("Questo capitolo spiega il concetto di Dependency Injection (DI) e come viene implementato in Spring tramite IoC e l'annotazione @Autowired.");
                        di.setLezioni(List.of(
                                        new Lezione("Cos'è la Dependency Injection?",
                                                        "La Dependency Injection (DI) è un principio fondamentale di Spring che permette a un oggetto di ricevere le sue dipendenze invece di crearle manualmente.\r\n",
                                                        di, null),
                                        new Lezione("Inversion of Control (IoC)",
                                                        "Per IoC (Inversion of Control) si intende un pattern di programmazione, secondo il quale si tende a tener disaccoppiati i singoli componenti di un sistema,\r\n"
                                                                        +
                                                                        "in cui le eventuali dipendenze non vengono scritte all'interno del componente stesso, ma gli vengono iniettate dall'esterno.\r\n"
                                                                        +
                                                                        "L’obiettivo di questo pattern è rendere le componenti software il più indipendenti possibile, affinché sia possibile modificarne una parte senza dover modificare le altre.\r\n",
                                                        di, null),
                                        new Lezione("@Autowired",
                                                        "L'annotazione @Autowired in Spring Boot viene utilizzata per iniettare automaticamente le dipendenze in un componente gestito dal framework.\r\n"
                                                                        +
                                                                        "Grazie a questa annotazione, Spring risolve e fornisce automaticamente un'istanza del bean richiesto, evitando la necessità di creare manualmente oggetti\r\n"
                                                                        +
                                                                        "e migliorando la gestione delle dipendenze.\r\n",
                                                        di, null)));

                        Capitolo mvc = new Capitolo();
                        mvc.setTitolo("Spring MVC");
                        mvc.setDescrizione("Questo capitolo introduce il framework Spring MVC, spiegando il modello Model-View-Controller e il ruolo dei controller.");
                        mvc.setLezioni(List.of(
                                        new Lezione("Cos'è Spring MVC?",
                                                        "Spring MVC è un framework per realizzare applicazioni web basate sul modello MCV sfruttando i punti di forza offerti dal framework Spring\r\n"
                                                                        +
                                                                        "come l’inversion of control (tramite dependency injection). Esso si occupa di mappare metodi e classi Java con determinati URL.\r\n"
                                                                        +
                                                                        "Il framework MVC si basa su una DispatcherServlet che gestisce tutte le richieste HTTP e le risposte.\r\n",
                                                        mvc, null),
                                        new Lezione("Model-View-Controller",
                                                        "Spring MVC è un framework per realizzare applicazioni web basate sul modello MCV sfruttando i punti di forza offerti dal framework Spring\r\n"
                                                                        +
                                                                        "come l’inversion of control (tramite dependency injection). Esso si occupa di mappare metodi e classi Java con determinati URL.\r\n"
                                                                        +
                                                                        "Il framework MVC si basa su una DispatcherServlet che gestisce tutte le richieste HTTP e le risposte.\r\n",
                                                        mvc, null),
                                        new Lezione("Spring Controller",
                                                        "Spring MVC è un framework per realizzare applicazioni web basate sul modello MCV sfruttando i punti di forza offerti dal framework Spring\r\n"
                                                                        +
                                                                        "come l’inversion of control (tramite dependency injection). Esso si occupa di mappare metodi e classi Java con determinati URL.\r\n"
                                                                        +
                                                                        "Il framework MVC si basa su una DispatcherServlet che gestisce tutte le richieste HTTP e le risposte.\r\n",
                                                        mvc, null)));

                        Capitolo hibernate = new Capitolo();
                        hibernate.setTitolo("Hibernate e JPA");
                        hibernate.setDescrizione("Questo capitolo esplora Hibernate e JPA, spiegando come gestire la persistenza dei dati in applicazioni Java.");
                        hibernate.setLezioni(List.of(
                                        new Lezione("Cos'è Hibernate?",
                                                        "Hibernate è un framework ORM che semplifica la gestione della persistenza dei dati in applicazioni Java.\r\n",
                                                        hibernate, null),
                                        new Lezione("Cos'è JPA?",
                                                        "JPA (Java Persistence API) è una specifica Java che consente la gestione e la persistenza dei dati nelle applicazioni.\r\n"
                                                                        +
                                                                        "In Spring Boot, JPA viene utilizzata insieme a Spring Data JPA per semplificare l'interazione con i database relazionali,\r\n"
                                                                        +
                                                                        "fornendo un'astrazione sugli ORM come Hibernate e riducendo la necessità di scrivere codice SQL manualmente.\r\n",
                                                        hibernate, null),
                                        new Lezione("Entity e Repository",
                                                        "In Spring Boot, JPA viene utilizzata per gestire la persistenza dei dati tramite le entità e i repository.\r\n"
                                                                        +
                                                                        "Un'@Entity rappresenta una tabella nel database, mentre un'@Repository è un'interfaccia che fornisce metodi per accedere e manipolare i dati.\r\n"
                                                                        +
                                                                        "Grazie a Spring Data JPA, i repository offrono operazioni CRUD pronte all'uso senza bisogno di scrivere query SQL manuali.\r\n",
                                                        hibernate, null)));

                        Capitolo apiRest = new Capitolo();
                        apiRest.setTitolo("API REST con Spring Boot");
                        apiRest.setDescrizione("Questo capitolo spiega come creare e gestire API REST utilizzando Spring Boot.");
                        apiRest.setLezioni(List.of(
                                        new Lezione("Cos'è un'API REST?",
                                                        "Un'API REST (Representational State Transfer) è un'architettura per lo sviluppo di applicazioni web basate su risorse, che possono essere identificate da URL.\r\n"
                                                                        +
                                                                        "Le risorse vengono rappresentate come oggetti e le operazioni su di esse (come lettura, creazione, aggiornamento, eliminazione) sono effettuate tramite i metodi HTTP.\r\n"
                                                                        +
                                                                        "Le API REST sono senza stato, il che significa che ogni richiesta contiene tutte le informazioni necessarie per essere elaborata, senza dipendere dallo stato precedente della comunicazione.\r\n",
                                                        apiRest, null),
                                        new Lezione("Spring REST Controller",
                                                        "In Spring Boot, il framework offre l'annotazione @RestController per semplificare la creazione di API REST.\r\n"
                                                                        +
                                                                        "Questa annotazione combina @Controller e @ResponseBody, permettendo ai metodi di restituire direttamente i dati senza la necessità di renderizzare una vista.\r\n"
                                                                        +
                                                                        "Utilizzando questa annotazione, possiamo definire facilmente endpoint che rispondono a richieste HTTP con oggetti Java che vengono automaticamente serializzati in formato JSON o XML.\r\n",
                                                        apiRest, null),
                                        new Lezione("Chiamate HTTP",
                                                        "Le chiamate HTTP sono il mezzo principale per comunicare con un'API REST. I metodi HTTP più comuni sono:\r\n"
                                                                        +
                                                                        "- **GET**: utilizzato per ottenere informazioni da una risorsa. Non modifica lo stato del server.\r\n"
                                                                        +
                                                                        "- **POST**: utilizzato per inviare dati al server per creare una nuova risorsa.\r\n"
                                                                        +
                                                                        "- **PUT**: utilizzato per aggiornare una risorsa esistente o crearne una nuova se non esiste.\r\n"
                                                                        +
                                                                        "- **DELETE**: utilizzato per eliminare una risorsa.\r\n"
                                                                        +
                                                                        "Ogni chiamata HTTP può essere associata a una specifica URL e, a seconda del metodo, il comportamento del server cambierà.\r\n",
                                                        apiRest, null)));

                        Capitolo security = new Capitolo();
                        security.setTitolo("Spring Security");
                        security.setDescrizione("Questo capitolo introduce Spring Security, spiegando come gestire autenticazione e autorizzazione.");
                        security.setLezioni(List.of(
                                        new Lezione("Autenticazione e Autorizzazione",
                                                        "Spring Security è un framework potente e flessibile per gestire la sicurezza nelle applicazioni.\r\n"
                                                                        +
                                                                        "Si occupa principalmente di due aspetti fondamentali: **autenticazione** e **autorizzazione**.\r\n"
                                                                        +
                                                                        "L'autenticazione è il processo di verifica dell'identità dell'utente (ad esempio, tramite nome utente e password),\r\n"
                                                                        +
                                                                        "mentre l'autorizzazione definisce i permessi dell'utente per accedere a risorse specifiche nell'applicazione, come pagine, API o funzionalità protette.\r\n"
                                                                        +
                                                                        "Spring Security consente di implementare facilmente la gestione dei ruoli e delle autorizzazioni per gli utenti, proteggendo le risorse in base ai permessi.\r\n",
                                                        security, null),
                                        new Lezione("Configurazione di Base",
                                                        "Spring Security può essere configurato in vari modi, ma la configurazione di base è semplice e veloce.\r\n"
                                                                        +
                                                                        "Può essere fatta direttamente nel codice tramite Java Config (utilizzando classi che estendono `WebSecurityConfigurerAdapter` e sovrascrivono i metodi per definire le regole di sicurezza)\r\n"
                                                                        +
                                                                        "o usando un file di configurazione XML.\r\n" +
                                                                        "La configurazione di base permette di proteggere le rotte dell'applicazione (ad esempio, limitare l'accesso a certe URL solo agli utenti autenticati)\r\n"
                                                                        +
                                                                        "e gestire la sessione utente, definendo anche il comportamento di login e logout.\r\n",
                                                        security, null),
                                        new Lezione("JWT e OAuth2",
                                                        "Spring Security supporta soluzioni di autenticazione avanzata come **JWT (JSON Web Tokens)** e **OAuth2**.\r\n"
                                                                        +
                                                                        "JWT è un metodo popolare per gestire l'autenticazione basata su token, dove un token viene generato dopo che l'utente ha effettuato il login\r\n"
                                                                        +
                                                                        "e poi utilizzato per autenticare le richieste successive.\r\n"
                                                                        +
                                                                        "OAuth2, invece, è un protocollo di autorizzazione che consente a un'applicazione di accedere alle risorse di un utente su un altro servizio senza richiedere la sua password.\r\n"
                                                                        +
                                                                        "In combinazione con Spring Security, queste tecnologie permettono di implementare un'autenticazione sicura e scalabile, particolarmente utile in scenari di microservizi o applicazioni distribuite.\r\n",
                                                        security, null)));

                        Capitolo tutorial = new Capitolo();
                        tutorial.setTitolo("Tutorial: Creazione Progetto Spring Boot");
                        tutorial.setDescrizione("Questo capitolo guida l'utente nella creazione di un progetto Spring Boot, dalla configurazione iniziale ai test.");
                        tutorial.setLezioni(List.of(
                                        new Lezione("Configurazione iniziale",
                                                        "Per iniziare un progetto con Spring Boot, il modo più semplice è usare **Spring Initializr** (https://start.spring.io/).\r\n"
                                                                        +
                                                                        "Questo strumento online permette di generare il codice di base del progetto in pochi passaggi, selezionando la versione di Spring Boot,\r\n"
                                                                        +
                                                                        "le dipendenze necessarie (come JPA, Web, Security, ecc.) e altre configurazioni di base.\r\n"
                                                                        +
                                                                        "Una volta completata la configurazione, Spring Initializr genera un file `.zip` che contiene il progetto pronto per essere aperto in un IDE, come IntelliJ IDEA o Eclipse.\r\n",
                                                        tutorial, null),
                                        new Lezione("Struttura del Progetto",
                                                        "Una volta generato il progetto con Spring Initializr, la struttura delle cartelle e dei file è organizzata in modo che sia facile iniziare lo sviluppo.\r\n"
                                                                        +
                                                                        "La cartella `src/main/java` contiene il codice sorgente Java, con la classe principale che avvia l'applicazione, annotata con `@SpringBootApplication`.\r\n"
                                                                        +
                                                                        "La cartella `src/main/resources` contiene i file di configurazione, come `application.properties` o `application.yml`,\r\n"
                                                                        +
                                                                        "che vengono utilizzati per configurare le proprietà del progetto, come la connessione al database, la porta del server e altre impostazioni.\r\n"
                                                                        +
                                                                        "Inoltre, è possibile trovare la cartella `src/test/java` dove sono definiti i test unitari.\r\n",
                                                        tutorial, null),
                                        new Lezione("Esecuzione e Test",
                                                        "Una volta configurato il progetto, è possibile eseguirlo facilmente utilizzando il comando `mvn spring-boot:run` (se si utilizza Maven)\r\n"
                                                                        +
                                                                        "o `gradle bootRun` (se si utilizza Gradle).\r\n"
                                                                        +
                                                                        "Una volta avviata l'applicazione, possiamo testare se tutto funziona correttamente utilizzando strumenti come **Postman**.\r\n"
                                                                        +
                                                                        "Con Postman, possiamo inviare richieste HTTP all'applicazione, come GET, POST, PUT o DELETE, per testare le API REST.\r\n"
                                                                        +
                                                                        "Inoltre, possiamo verificare le risposte del server e assicurarci che le funzionalità siano correttamente implementate.\r\n",
                                                        tutorial, null)));

                        // Salviamo i capitoli con le relative lezioni
                        capitoloRepository.saveAll(List.of(intro, di, mvc, hibernate, apiRest, security, tutorial));
                }
        }
}