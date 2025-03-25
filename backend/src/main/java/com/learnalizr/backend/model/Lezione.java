package com.learnalizr.backend.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Lezione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titolo;
    private String contenuto;

    @ManyToOne
    @JoinColumn(name = "capitolo_id", nullable = false)
    private Capitolo capitolo;

    @OneToMany(mappedBy = "lezione", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Media> media;

    public Lezione() {
    }

    public Lezione(String titolo, String contenuto, Capitolo capitolo, Media media) {
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.capitolo = capitolo;
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

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setCapitolo(Capitolo capitolo) {
        this.capitolo = capitolo;
    }

    public Capitolo getCapitolo() {
        return capitolo;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public List<Media> getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Lezione{" + "id=" + id + ", titolo='" + titolo + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", capitolo=" + (capitolo != null ? capitolo.getID() : "null") +
                '}';
    }
}
