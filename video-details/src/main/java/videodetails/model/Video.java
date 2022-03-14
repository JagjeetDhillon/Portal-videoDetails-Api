package videodetails.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long video_id;
	private String video_title;
	private String video_format;
	private String video_size;
	private String video_quality;
	
	
	public Video(long video_id, String video_title, String video_format, String video_size, String video_quality) {
		super();
		this.video_id = video_id;
		this.video_title = video_title;
		this.video_format = video_format;
		this.video_size = video_size;
		this.video_quality = video_quality;
	}
	
	
	
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}



	public double getVideo_id() {
		return video_id;
	}
	public void setVideo_id(long video_id) {
		this.video_id = video_id;
	}
	public String getVideo_title() {
		return video_title;
	}
	public void setVideo_title(String video_title) {
		this.video_title = video_title;
	}
	public String getVideo_format() {
		return video_format;
	}
	public void setVideo_format(String video_format) {
		this.video_format = video_format;
	}
	public String getVideo_size() {
		return video_size;
	}
	public void setVideo_size(String video_size) {
		this.video_size = video_size;
	}
	public String getVideo_quality() {
		return video_quality;
	}
	public void setVideo_quality(String video_quality) {
		this.video_quality = video_quality;
	}
	
	@Override
	public String toString() {
		return "Video [video_id=" + video_id + ", video_title=" + video_title + ", video_format=" + video_format
				+ ", video_size=" + video_size + ", video_quality=" + video_quality + "]";
	}
	
	
}
