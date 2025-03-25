package com.learnalizr.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnalizr.backend.model.Capitolo;

@Repository
public interface CapitoloRepository extends JpaRepository<Capitolo, Long> {
}
