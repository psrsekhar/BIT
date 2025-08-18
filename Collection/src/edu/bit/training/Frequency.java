package edu.bit.training;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Frequency {
	public static void main(String[] a) {
		List<Integer> series1 = Arrays.asList(10, 20, 20, 2, 3, 2, 4);
		List<Integer> series2 = Arrays.asList(10, 20, 20, 2, 3, 2, 4);
		
		Set<Integer> integers = new TreeSet<Integer>();
		integers.addAll(series1);
		integers.addAll(series2);
	}
}

/**
 * Scanner scan = new Scanner(System.in); 
 * for (int i = 0; i < 7; i++) {
 * series.add(scan.nextInt()); } for (int i = 0; i < nums.length; i++) {
 * map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); }
 */