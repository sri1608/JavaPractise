package classesandrelations;

import java.util.List;

public class User {
	
	private int id;
	private String name; 
	private List<UserMovie> movies;
	
	public User() {}

	public User(int id, String name, List<UserMovie> movies) {
		this.id = id;
		this.name = name;
		this.movies = movies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserMovie> getMovies() {
		return movies;
	}

	public void setMovies(List<UserMovie> movies) {
		this.movies = movies;
	}

	
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", movies=" + movies + "]";
	}
	

}
