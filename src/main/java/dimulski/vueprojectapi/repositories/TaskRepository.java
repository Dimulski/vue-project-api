package dimulski.vueprojectapi.repositories;

import dimulski.vueprojectapi.entities.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends BaseRepository<Task, Long> {

}
