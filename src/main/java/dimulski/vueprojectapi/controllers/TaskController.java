package dimulski.vueprojectapi.controllers;

import dimulski.vueprojectapi.entities.Task;
import dimulski.vueprojectapi.repositories.TaskRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TaskController extends BaseController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/tasks/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable(value = "id") Long id) throws NotFoundException {
        Task task =
                taskRepository
                        .findById(id)
                        .orElseThrow(() -> new NotFoundException("Todo not found on :: " + id));
        return ResponseEntity.ok().body(task);
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody @Valid Task task) {
        return taskRepository.save(task);
    }
}
