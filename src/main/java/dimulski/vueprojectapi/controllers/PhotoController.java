package dimulski.vueprojectapi.controllers;

import dimulski.vueprojectapi.entities.Photo;
import dimulski.vueprojectapi.repositories.PhotoRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PhotoController extends BaseController {

    @Autowired
    private PhotoRepository photoRepository;

    @GetMapping("/photos")
    public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

    @GetMapping("/photos/{id}")
    public ResponseEntity<Photo> getPhotoById(@PathVariable(value = "id") Long id) throws NotFoundException {
        Photo photo =
                photoRepository
                        .findById(id)
                        .orElseThrow(() -> new NotFoundException("Photo not found on :: " + id));
        return ResponseEntity.ok().body(photo);
    }

    @PostMapping("/photos")
    public Photo createPhoto(@RequestBody @Valid Photo photo) {
        return photoRepository.save(photo);
    }
}
