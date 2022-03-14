package videodetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import videodetails.model.Video;
import videodetails.repositories.VideoDetailRepositories;

@Service
public class VideoServiceImpl implements VideoService {
	
	
	@Autowired
	private VideoDetailRepositories videoDetailRepositories;

	@Override
	public List<Video> getAllVideos() {
		List<Video> video = (List<Video>) videoDetailRepositories.findAll();
		return video;
	}

	@Override
	public Optional<Video> getVideoById(long id) {
		Optional<Video> video =  videoDetailRepositories.findById(id);
		return video;
		
	}

	@Override
	public Video saveVideo(Video video) {
		videoDetailRepositories.save(video);
		return video;
	}

	
	
	
}
