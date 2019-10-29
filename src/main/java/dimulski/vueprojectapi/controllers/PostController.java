package dimulski.vueprojectapi.controllers;

import dimulski.vueprojectapi.entities.Post;
import dimulski.vueprojectapi.repositories.PostRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable(value = "id") Long id) throws NotFoundException {
        Post post =
                postRepository
                        .findById(id)
                        .orElseThrow(() -> new NotFoundException("User not found on :: " + id));
        return ResponseEntity.ok().body(post);
    }

    @PostMapping("/posts")
    public Post createPost(@RequestBody @Valid Post post) {
        return postRepository.save(post);
    }
}
