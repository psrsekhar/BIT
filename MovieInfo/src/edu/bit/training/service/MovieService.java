package edu.bit.training.service;

import edu.bit.training.model.Movie;

public interface MovieService {
	public boolean add(Movie movie);
	public Movie[] getAllMovies();
}
