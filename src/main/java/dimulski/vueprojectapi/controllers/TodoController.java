package dimulski.vueprojectapi.controllers;

import dimulski.vueprojectapi.entities.Todo;
import dimulski.vueprojectapi.repositories.TodoRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TodoController extends BaseController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @GetMapping("/todos/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable(value = "id") Long id) throws NotFoundException {
        Todo todo =
                todoRepository
                        .findById(id)
                        .orElseThrow(() -> new NotFoundException("Todo not found on :: " + id));
        return ResponseEntity.ok().body(todo);
    }

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody @Valid Todo todo) {
        return todoRepository.save(todo);
    }
}
