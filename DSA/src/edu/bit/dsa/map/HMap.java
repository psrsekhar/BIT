package edu.bit.dsa.map;

import java.util.HashMap;
import java.util.Map;

public class HMap {
	public static void main(String[] args) {
		Map<String, String> pairs = new HashMap<String, String>();
		pairs.put("Samantha", "Sairam");
		pairs.put(null, null);//null values are allowed and only one null key is allowed
		pairs.put("Trisha", "Sukanth");
		pairs.put("Jyothika", "Suriya");
		pairs.put("Nayanatara", "Stalin");
		
		System.out.println(pairs.get("Samantha"));
		System.out.println(pairs.values());
		System.out.println(pairs.keySet());
		System.out.println(pairs.entrySet());
	}
}