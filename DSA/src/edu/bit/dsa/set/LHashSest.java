package edu.bit.dsa.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LHashSest {

	public static void main(String[] args) {
		Set<String> relationShip = new LinkedHashSet<String>();
		relationShip.add("Meet");
		relationShip.add("Chatting");
		relationShip.add("Feelings");
		relationShip.add("Acceptance");
		relationShip.add("Job");
		relationShip.add("Parents Acceptance");
		relationShip.add("Marriage");
		
		System.out.println(relationShip);
	}
}