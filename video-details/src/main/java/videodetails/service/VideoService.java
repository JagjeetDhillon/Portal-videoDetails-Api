package videodetails.service;
import java.util.List;
import java.util.Optional;
import videodetails.model.Video;
import org.springframework.stereotype.Service;


@Service
public interface VideoService {
	
	public List<Video> getAllVideos();
	public Optional<Video>  getVideoById(long id);
	public Video saveVideo(Video video);
	
}
