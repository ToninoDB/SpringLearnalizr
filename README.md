# SpringLearnalizr

## 👥​ Contributors
- Aniello Bagno
  Linkedin:
  Email: bagnoaniello@gmail.com
  
- Giuseppe Ragosta
  Linkedin: https://www.linkedin.com/in/giuseppe-ragosta-a16409253?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app
  Email: giuseppe.ragosta29@gmail.com
  
- Antonio Russomando
  Linkedin: https://www.linkedin.com/in/antonio-russomando-6559aa357/
  Email: antonio.russomando11@gmail.com

## 📘 Descrizione del Progetto

**SpringLearnalizr** è una webapp educativa progettata per supportare l'apprendimento del framework **Spring di Java** tramite un sistema **interattivo e visivo**.  
Lʼidea prende ispirazione dalla webapp *Seeing Theory*, con lʼobiettivo di rendere i concetti complessi di Spring facilmente accessibili anche a chi è alle prime armi.

La piattaforma è suddivisa in **capitoli**, ognuno dei quali introduce e spiega visivamente concetti fondamentali come Spring MVC, Dependency Injection, REST API, Hibernate e altro ancora.

## 🧱 Struttura del Progetto

La repository è organizzata in due macro-directory:

- **backend/** – Applicazione Spring Boot che espone API REST per il frontend.
- **frontend/** – Applicazione Angular responsabile dell'interfaccia utente e dell'interazione con gli utenti.

### 📂 Backend (Spring Boot)

Il backend gestisce:

- La struttura dei **capitoli** e delle relative **lezioni**
- Le API per il recupero dei contenuti didattici
- Connessione al database **MySQL**
- Librerie e tecnologie usate:
  - Spring Boot
  - Spring Data JPA
  - MySQL
  - Gradle

### 📂 Frontend (Angular)

Il frontend gestisce:

- Navigazione tra capitoli
- Visualizzazione dinamica e responsive delle lezioni
- Scroll orizzontale con animazioni e transizioni
- Architettura basata su componenti Angular

## 📚 Contenuti Trattati

Ogni capitolo della piattaforma affronta un concetto base del framework Spring:

- **Introduzione a Spring**
- **Dependency Injection**
- **Spring MVC**
- **Hibernate & JPA**
- **API REST**
- **Spring Security**
- **Tutorial pratico: Creazione di un progetto Spring**

## 🧠 Architettura Dati

Il modello dati principale include:

- `Capitolo`: rappresenta una sezione tematica (es. "Spring MVC").
- `Lezione`: rappresenta i contenuti di un capitolo (paragrafi, spiegazioni, esercizi).
- Relazione **uno-a-molti** tra Capitolo e Lezione.

## ⚙️ Tecnologie Utilizzate

### Backend
- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Gradle

### Frontend
- Angular 16
- TypeScript
- HTML5 + CSS3 / SCSS
- RxJS

## 💻 Implementazioni future
Essendo un primo prototipo di una webapp educativa, lo abbiamo reso quanto più scalabile e ottimizzato possibile così da poter implementare in futuro nuove feature già discusse durante la fase di stesura del paper. Si è pensato di poter aggiugnere delle vere e proprie task di apprendimento a fine lezione così da imprimere meglio i concetti logici del framework e magari aggiungere anche degli esercizi (es. vedi https://www.w3schools.com/). Quindi ogni utente potrà decidere di registrarsi al sito e nella sezione personale vedere tutti i progressi di apprendimento fatto, le varie lezioni seguite, gli esercizi svolti, ecc...

Il team di sviluppo è aperto all'aggiunta di nuove features da parte degli utenti e feedback per avere un prodotto finale ottimizzato e funzionale.

## 🚀 Avvio del Progetto

### Backend

```bash
cd backend
./gradlew bootRun
```

### Frontend
```bash 
cd frontend
npm install
ng serve
```
