package com.learnalizr.backend.service;
import com.learnalizr.backend.model.Lezione;
import com.learnalizr.backend.repository.LezioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LezioneService {
    @Autowired
    private LezioneRepository repository;

    public List<Lezione> getLezioniByCapitolo(Long capitoloID){
        return repository.findAll();
    }
    public Lezione saveLezione(Lezione lezione){
        return repository.save(lezione);
    }
}
