package com.learnalizr.backend.controller;

import com.learnalizr.backend.model.Media;
import com.learnalizr.backend.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping
public class MediaController {
    @Autowired
    private MediaService service;

    @GetMapping
    public List<Media> getAllMedia() {
        return service.getAllMedia();
    }

    @GetMapping("/{id}")
    public Optional<Media> getMediaById(@PathVariable Long id) {
        return service.getMediaById(id);
    }

    @PostMapping
    public Media createMedia(@RequestBody Media media) {
        return service.saveMedia(media);
    }

    @DeleteMapping("/{id}")
    public void deleteMedia(@PathVariable Long id) {
        service.deleteMedia(id);
    }
}
