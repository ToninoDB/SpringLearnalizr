package com.learnalizr.backend.model;

import jakarta.persistence.*;

//import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Lezione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titolo;

    @Column(columnDefinition = "TEXT")
    private String contenuto;

    @ManyToOne
    @JoinColumn(name = "capitolo_id", nullable = false)
    @JsonBackReference
    private Capitolo capitolo;

    /*
     * @OneToMany(mappedBy = "lezione", cascade = CascadeType.ALL, fetch =
     * FetchType.LAZY)
     * 
     * @JsonManagedReference
     * private List<Media> media;
     */

    private String img_path;

    public Lezione() {
    }

    public Lezione(String titolo, String contenuto, Capitolo capitolo, String img_path) {
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.capitolo = capitolo;
        this.img_path = img_path;
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

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    @Override
    public String toString() {
        return "Lezione{" + "id=" + id + ", titolo='" + titolo + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", capitolo=" + (capitolo != null ? capitolo.getID() : "null") +
                '}';
    }
}
