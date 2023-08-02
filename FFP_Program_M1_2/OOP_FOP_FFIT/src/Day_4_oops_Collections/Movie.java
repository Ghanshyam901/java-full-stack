package Day_4_oops_Collections;

public class Movie {
	private int id , duration;
	private double rating;
	private String name;
	
	 public Movie(){
		
	}

	public Movie(int id, double rating, int duration, String name) {
		super();
		this.id = id;
		this.rating = rating;
		this.duration = duration;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", duration=" + duration + ", rating=" + rating + ", name=" + name + "]";
	}
	 
	
	
	
}
