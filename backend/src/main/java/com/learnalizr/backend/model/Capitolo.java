package com.learnalizr.backend.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Capitolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titolo;
    private String descrizione;

    @OneToMany(mappedBy = "capitolo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Lezione> lezioni;

    public Capitolo() {
    }

    public Capitolo(String titolo, String descrizione, List<Lezione> lezioni) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.lezioni = lezioni;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public Long getID() {
        return id;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setLezioni(List<Lezione> lezioni) {
        this.lezioni = lezioni;
    }

    public List<Lezione> getLezioni() {
        return lezioni;
    }

    @Override
    public String toString() {
        return "Capitolo{" + "id=" + id + ", titolo='" + titolo + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", lezioni=" + (lezioni != null ? lezioni.size() : "0") +
                '}';
    }
}
