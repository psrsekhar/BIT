package edu.bit.training;

public class Samantha extends Actress{
	public Samantha() {		
		super();
		System.out.println("In Samantha()");
	}
	
	@Override
	public void renumeration() {
		System.out.println("Samantha is charging 100000 ruppes per hour.....");
	}
}
