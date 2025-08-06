package edu.bit.training;

import edu.bit.training.model.Movie;
import edu.bit.training.service.MovieService;
import edu.bit.training.service.impl.MovieServiceImpl;

public class BIT {

	public static void main(String[] args) {
		MovieService movieService = new MovieServiceImpl();
		Movie movie = new Movie(1, "Leo", "Vijay, Trisha...");
		if(movieService.add(movie)) {
			
			movieService.add(new Movie(2, "Vada Chennai", "Dhanush, Andreah..."));
			System.out.println("Movie is added...");
			Movie[] movieList = movieService.getAllMovies();
			for(Movie m: movieList) {
				if(m != null) {
					System.out.println(m.getId() + "\t" + m.getTitle());
				}else {
					break;
				}
			}
 		}else {
			System.err.println("Failed to add a movie...");
		}
	}
}
