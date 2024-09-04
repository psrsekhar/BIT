package edu.bit.training;

public class Actress {
	public Actress() {
		System.out.println("In Actress()");
	}
	
	//can not override
	public final void acting() {
		System.out.println("Actress is acting....");
	}
	public final void makeup() {
		System.out.println("Actress is applying mmake up.....");
	}
	public void renumeration() {}
}
 