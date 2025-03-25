package com.learnalizr.backend.controller;

import com.learnalizr.backend.model.Lezione;
import com.learnalizr.backend.service.LezioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/lezioni")
public class LezioneController {
    @Autowired
    private LezioneService service;

    @GetMapping("/capitoli/{capitoloId}")
    public List<Lezione> getLezioniByCapitolo(@PathVariable Long capitoloId) {
        return service.getLezioniByCapitolo(capitoloId);
    }

    @GetMapping("/lezioni/{lezioneId}")
    public Lezione getLezioneById(@PathVariable Long lezioneId) {
        return service.getLezioneById(lezioneId);
    }

    @PostMapping
    public Lezione createLezione(@RequestBody Lezione lezione) {
        return service.saveLezione(lezione);
    }
}
