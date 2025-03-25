package com.learnalizr.backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;
    private String filePath;
    private String mediaType;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "lesson_id", nullable = false)
    private Lezione lezione;

    // Costruttori
    public Media() {
        this.createdAt = LocalDateTime.now(); // Imposta la data di creazione automatica
    }

    public Media(String fileName, String filePath, String mediaType, Lezione lezione) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.mediaType = mediaType;
        this.lezione = lezione;
        this.createdAt = LocalDateTime.now();
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Lezione getLezione() {
        return lezione;
    }

    public void setLezione(Lezione lezione) {
        this.lezione = lezione;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", mediaType='" + mediaType + '\'' +
                ", createdAt=" + createdAt +
                ", lezione=" + (lezione != null ? lezione.getID() : "null") +
                '}';
    }
}
