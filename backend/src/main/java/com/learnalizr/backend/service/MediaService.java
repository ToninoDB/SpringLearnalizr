package com.learnalizr.backend.service;
import com.learnalizr.backend.model.Media;
import com.learnalizr.backend.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MediaService {
    @Autowired
    private MediaRepository repository;

    public List<Media> getAllMedia(){
        return repository.findAll();
    }
    public Optional<Media> getMediaById(Long id){
        return repository.findById(id);
    }
    public Media saveMedia(Media media){
        return repository.save(media);
    }
    public void deleteMedia(Long id){
        repository.deleteById(id);
    }
}
