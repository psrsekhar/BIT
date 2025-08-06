package edu.bit.training.model;

//encapsulated class
public class Movie {
	private Integer id;
	private String title;
	private String cast;
	
	public Movie(Integer id, String title, String cast) {
		this.id = id;
		this.title = title;
		this.cast = cast;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
}
