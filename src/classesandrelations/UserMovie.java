package classesandrelations;

public class UserMovie {

	private String name;
	private double duration;
	
	public UserMovie() {}

	public UserMovie(String name, double duration) {
		this.name = name;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	
	public String toString() {
		return "UserMovie [name=" + name + ", duration=" + duration + "]";
	}
	
	
}
