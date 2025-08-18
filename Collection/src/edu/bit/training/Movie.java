package edu.bit.training;


public class Movie implements Comparable<Movie>{
	private String name;
	private double rating;
	
	public Movie(String name, double rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getRating() {
		return this.rating;
	}

	@Override
	public int compareTo(Movie movie) {
		int returnCompare = Double.compare(movie.rating, this.rating); 
		if(returnCompare != 0) {
			return returnCompare;
		}
		return this.name.compareTo(movie.name);
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name +"\tRating: " + this.rating;
	}
}















