package dimulski.vueprojectapi.repositories;

import dimulski.vueprojectapi.entities.Todo;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends BaseRepository<Todo, Long> {

}
