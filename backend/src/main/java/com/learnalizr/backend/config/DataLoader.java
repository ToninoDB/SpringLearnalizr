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
            Capitolo capitolo = new Capitolo();
            capitolo.setTitolo("Introduzione a SpringBoot");

            Lezione lezione1 = new Lezione();
            lezione1.setTitolo("Cos'è Spring?");
            lezione1.setContenuto("Spring è un framework per Java...");
            lezione1.setCapitolo(capitolo);

            capitolo.setLezioni(List.of(lezione1));
            capitoloRepository.save(capitolo);
        }
    }
}