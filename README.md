# Spring Learnalizr

## Progetto Spring Learnalizr - Piattaforma Educativa

### 1. Introduzione
**Spring Learnalizr** è una webapp educativa progettata per supportare l'apprendimento del framework **Spring** di Java attraverso un sistema interattivo.  
L'idea alla base di questo progetto è ispirata alla webapp **Seeing Theory**.  
Il progetto utilizza il framework **Spring Boot** per il backend e **Angular** per il frontend.

---

### 2. Struttura dell’app
L’app sarà divisa in **capitoli interattivi** per coprire i principali concetti di Spring:

#### **Introduzione a Spring**
- Cos’è Spring e perché viene utilizzato
- Nessuna configurazione iniziale
- Risoluzione codice boilerplate
- SpringBoot Initializr

---

#### **Dependency Injection**
- Spiegazione della Dependency Injection (DI)
- **IoC** (Inversion of Control)
- **Bean** & **Autowired**

---

#### **Spring MVC**
- Spiegazione del pattern **Model-View-Controller** (MVC)

---

#### **Hibernate**
- Spiegazione di Hibernate  
- **JPA** (Java Persistence API)  
- **ORM** (Object-Relational Mapping)  

---

#### **API REST**
- Cosa sono le API REST  
- Tipi di API REST  

---

#### **Spring Security**
- Tutorial creazione progetto Spring  

---

### 3. Tecnologie Utilizzate
**Backend:**
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Gradle  

**Frontend:**
- Angular  

---

### 4. Diagramma delle classi
La classe **Capitolo** rappresenta i capitoli degli argomenti che verranno spiegati.  
La classe **Lezione** rappresenta i paragrafi del capitolo.  
La classe **Media** conterraà i media associato ad ogni lezione.
La relazione tra le due classi sarà **uno-a-molti**, poiché un capitolo può avere più di una lezione.  

---

