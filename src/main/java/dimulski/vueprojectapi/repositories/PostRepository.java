package dimulski.vueprojectapi.repositories;

import dimulski.vueprojectapi.entities.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends BaseRepository<Post, Long> {

}
