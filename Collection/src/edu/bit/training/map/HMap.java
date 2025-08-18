package edu.bit.training.map;

import java.util.HashMap;
import java.util.Map;

public class HMap {

	public static void main(String[] args) {
		Map<String, Double> ratings = new HashMap<String, Double>();
		ratings.put("GoodBadUgly", 3.5);
		ratings.put("VadaChennai", 5.0);
		ratings.put("Leo", 5.0);
		ratings.put("Retro", 4.5);
		ratings.put("KGF", 5.0);
		ratings.put("Mahaan", 4.8);
		ratings.put("Mahaan", 5.00);
		
		System.out.println(ratings.values());//returns all values
		System.out.println(ratings.get("ABC"));//return value for a key
		System.out.println(ratings.containsKey("ABC"));//return true or false
		System.out.println(ratings.containsValue(5.0));//return true or false
		
		ratings.remove("Mahaan");//remove set from map
		System.out.println(ratings.keySet());//returns all keys
		
		System.out.println(ratings.entrySet());//returns all key and value sets
		
		ratings.keySet().forEach(System.out::println);//lambda expression to get all keys
		ratings.values().forEach(System.out::println);//lambda expression to get all values
		ratings.entrySet().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));//lambda expression to get all key-value sets
		
		ratings.forEach((key, value) -> System.out.println(key + ":" + value));//lambda expression to get all key-value sets
	}
}







