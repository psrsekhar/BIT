package edu.bit.dsa.map;

import java.util.SortedMap;
import java.util.TreeMap;


public class TMap {
	public static void main(String[] args) {
		SortedMap<String, Integer> actressRatings = new TreeMap<String, Integer>();
		actressRatings.put("Samantha", 5);
		actressRatings.put("Rashmika", 4);
		actressRatings.put("Anushka", 4);
		actressRatings.put("Sunny Leone", 3);
		actressRatings.put("Silk Smitha", 5);
		
		System.out.println(actressRatings.entrySet());
	}
}