package edu.bit.training.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LHMap {

	public static void main(String[] args) {
		Map<String, Double> movies = new LinkedHashMap<String, Double>();
		movies.put("Coolie", 5.0);
		movies.put("Kanchana", 4.5);
		movies.put("Manmadhan", 4.8);
		movies.put("Legend", 3.0);
		movies.put("Dia", 5.0);
		movies.put("PuliMurugan", 5.0);
		movies.putIfAbsent("ThaniOruvan", 5.0);
		
		System.out.println(movies.values());
	}
}