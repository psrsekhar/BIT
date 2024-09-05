package edu.bit.dsa.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import edu.bit.dsa.model.Job;
import edu.bit.dsa.model.Movie;


public class Sorting {
	public static void main(String[] args) {
		List<Job> jobList = new LinkedList<Job>();
		jobList.add(new Job("Youtube", 3));
		jobList.add(new Job("OS", 1));
		jobList.add(new Job("Call", 2));
		jobList.add(new Job("Instagram", 4));
		
		jobList.sort(Comparator.comparingInt(job->job.getPriority()));//Ascending Order
		
		for(Job job: jobList) {
			System.out.println(job.getName() +"\t" + job.getPriority());
		}
	}

	public static void comparableSorting() {
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie(1, "GOAT", 2024));
		movies.add(new Movie(2, "Pushpa", 2022));
		movies.add(new Movie(3, "KGF", 2020));
		movies.add(new Movie(4, "RRR", 2023));
		movies.add(new Movie(5, "Remo", 2016));
		
		Collections.sort(movies);//Ascending order
		for(Movie movie: movies) {
			System.out.println(movie.getName() + "\t" + movie.getReleasedYear());
		}
		
		Collections.sort(movies, Collections.reverseOrder());//Descending order
		for(Movie movie: movies) {
			System.out.println(movie.getName() + "\t" + movie.getReleasedYear());
		}		
	}
	
	public static void naturalSorting() {
		List<String> animals = new LinkedList<String>();
		animals.add("Dianosour");
		animals.add("Dragon");
		animals.add("Goat");
		animals.add("Cat");
		
		System.out.println(animals);
		Collections.sort(animals);//Ascending order
		System.out.println(animals);
		
		Collections.sort(animals, Collections.reverseOrder());//Descending order
		System.out.println(animals);		
	}
}