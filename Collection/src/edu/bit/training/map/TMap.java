package edu.bit.training.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TMap {

	public static void main(String[] args) {
		SortedMap<String, String> iplCaptains = new TreeMap<String, String>();
		iplCaptains.put("PunjabKings", "Shreyas Iyer");
		iplCaptains.put("CSK", "MS Dhoni");
		iplCaptains.put("MI", "Hardik Pandya");
		iplCaptains.put("RCB", "Rjat Patidar");
		iplCaptains.put("KKR", "Ajinkya Rahane");
		iplCaptains.put("GT", "Subhman Gill");
		iplCaptains.put("SRH", "Kavya Maran");
		iplCaptains.put("DC", "Axar Patel");
		//iplCaptains.putLast("LSG", "Rishab Pant"); //RE: UnsupportedOperationException
		//iplCaptains.putFirst("RR", "Sanju Samson"); //RE: UnsupportedOperationException
		
		System.out.println(iplCaptains.values());
	}

}
