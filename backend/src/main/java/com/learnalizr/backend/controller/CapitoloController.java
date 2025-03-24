package com.learnalizr.backend.controller;
import com.learnalizr.backend.model.Capitolo;
import com.learnalizr.backend.service.CapitoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/capitoli")
public class CapitoloController {
    @Autowired
    private CapitoloService service;

    @GetMapping
    public List<Capitolo> getCapitoli(){
        return service.getAllCapitoli();
    }
    @GetMapping("/{id}")
    public Capitolo getCapitolo(@PathVariable Long id){
        return service.getCapitoloByID(id);
    }
    @PostMapping
    public Capitolo createCapitolo(@RequestBody Capitolo capitolo){
        return service.saveCapitolo(capitolo);
    }
}
