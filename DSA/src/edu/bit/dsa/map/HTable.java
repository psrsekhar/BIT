package edu.bit.dsa.map;

import java.util.Hashtable;
import java.util.Map;

public class HTable {
	public static void main(String[] args) {
		Map random= new Hashtable();//Heterogeneous keys and values are allowed 	
		random.put("BIT", "College");
		random.put(2, "Ranking");
		random.put(9.3f, 10);
		//random.put(null,10);-->Runtime error: null key is not allowed
		//random.put(10,null);-->Runtime error: null value is not allowed
		System.out.println(random.entrySet());
	}
}