package com.learnalizr.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnalizr.backend.model.Capitolo;

public interface CapitoloRepository extends JpaRepository<Capitolo, Long> {
}
