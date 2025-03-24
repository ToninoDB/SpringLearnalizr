package com.learnalizr.backend.controller;
import com.learnalizr.backend.model.Lezione;
import com.learnalizr.backend.service.LezioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/lezioni")
public class LezioneController {
    @Autowired
    private LezioneService service;

    @GetMapping("/capitolo/{capitoloId}")
    public List<Lezione> getLezioniByCapitolo(@PathVariable Long capitoloId){
        return service.getLezioniByCapitolo(capitoloId);
    }
    @PostMapping
    public Lezione createLezione(@RequestBody Lezione lezione){
        return service.saveLezione(lezione);
    }
}
