package edu.bit.training;

//can not extend
public final class FinalClass {
	//can not change value after initialization
	public final String name = "Samantha";
	
	//cannot over ride
	public final String getName() {
		return this.name;
	}
}
