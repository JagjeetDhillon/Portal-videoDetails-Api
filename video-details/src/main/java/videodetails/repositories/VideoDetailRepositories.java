package videodetails.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import videodetails.model.Video;

@Repository
public interface VideoDetailRepositories extends CrudRepository<Video, Long> {
	
}
