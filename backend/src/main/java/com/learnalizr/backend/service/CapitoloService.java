package com.learnalizr.backend.service;
import com.learnalizr.backend.model.Capitolo;
import com.learnalizr.backend.repository.CapitoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CapitoloService {
    @Autowired
    private CapitoloRepository repository;

    public List<Capitolo> getAllCapitoli(){
        return repository.findAll();
    }
    public Capitolo getCapitoloByID(Long id){
        return repository.findById(id).orElse(null);
    }
    public Capitolo saveCapitolo (Capitolo capitolo){
        return repository.save(capitolo);
    }
}
