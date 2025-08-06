package edu.bit.training.service.impl;

import edu.bit.training.model.Movie;
import edu.bit.training.service.MovieService;

public class MovieServiceImpl implements MovieService{
	private static Movie[] movieList = new Movie[10];
	private static int index = 0;
	
	@Override
	public boolean add(Movie movie) {
		movieList[index] = movie;
		index++;
		System.out.println("Movie Count:" + movieList.length);
		return true;
	}

	@Override
	public Movie[] getAllMovies() {
		return this.movieList;
	}
}
