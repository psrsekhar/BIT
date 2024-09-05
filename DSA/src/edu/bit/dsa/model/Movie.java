package edu.bit.dsa.model;

public class Movie implements Comparable<Movie> {
	private Integer id;
	private String name;
	private Integer releasedYear;
	
	public Movie(Integer id, String name, Integer releasedYear) {
		this.id = id;
		this.name = name;
		this.releasedYear = releasedYear;
	}
	
	@Override
	public int compareTo(Movie o) {		
		return Integer.compare(this.releasedYear, o.releasedYear);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getReleasedYear() {
		return releasedYear;
	}
	public void setReleasedYear(Integer releasedYear) {
		this.releasedYear = releasedYear;
	}
}