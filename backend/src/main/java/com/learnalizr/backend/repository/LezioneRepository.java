package com.learnalizr.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learnalizr.backend.model.Lezione;

public interface LezioneRepository extends JpaRepository<Lezione, Long> {
}