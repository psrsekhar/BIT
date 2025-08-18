package edu.bit.training;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Movie> movieInfo = new LinkedList<Movie>();
		movieInfo.add(new Movie("Coolie", 5));
		movieInfo.add(new Movie("Vikram", 5));
		movieInfo.add(new Movie("Leo", 5));
		movieInfo.add(new Movie("Jersey", 4.8));
		movieInfo.add(new Movie("ThugLife", 1));
		movieInfo.add(new Movie("Indian2", 2));

		/**
		movieInfo.sort(Comparator.comparing(Movie::getName));// sorting based on name

		// sorting based on rating in descending order and name in ascending order (multiple fields) 
		movieInfo.sort(Comparator.comparingDouble(Movie::getRating).reversed().thenComparing(Movie::getName));
		*/
		Collections.sort(movieInfo);
		
		for (Movie movie : movieInfo) {
			System.out.println(movie.getName() + "\t" + movie.getRating());
		}
		
		Movie movie = new Movie("Indian2", 2);
		System.out.println(movie);
	}
}







