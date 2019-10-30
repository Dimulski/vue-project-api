package dimulski.vueprojectapi.repositories;

import dimulski.vueprojectapi.entities.Photo;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends BaseRepository<Photo, Long> {

}
