package videodetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import videodetails.model.Video;
import videodetails.service.VideoService;

@RestController
@RequestMapping("/video")
public class VideoController {

	// invoking object to VideoService interface
	@Autowired
	private VideoService videoService;
	
	@GetMapping("/list")
	public List<Video> videoDetails() {
		List<Video> video = videoService.getAllVideos();
		return video;
	}
	
	@GetMapping("/list/{video_id}")
	public Optional<Video> getVideoListById(@PathVariable String video_id) {
		
		Optional<Video> video = videoService.getVideoById(Long.parseLong(video_id));
		return video;
	}
	
	@PostMapping("/saveDetails")
	public Video saveVideoDetails(@RequestBody Video video) {
		
		Video videoDetail = videoService.saveVideo(video);
		return videoDetail;
	}
}
