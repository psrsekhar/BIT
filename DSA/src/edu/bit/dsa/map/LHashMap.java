package edu.bit.dsa.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LHashMap {
	public static void main(String[] args) {
		Map<String, Integer> ratings = new LinkedHashMap<String, Integer>();
		ratings.put("Leo", 4);
		ratings.put("PS1", 5);
		ratings.put("PS2", 5);
		ratings.put("Legend", 3);
		ratings.put("Indian2", 2);
		ratings.put("Chandramukhi2", 1);
		ratings.put(null, null);
		
		System.out.println(ratings.entrySet());
		for(String movie:ratings.keySet()) {
			System.out.println("Movie name: " + movie);
		}
	}
}