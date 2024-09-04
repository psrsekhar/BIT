package edu.bit.training;

public strictfp class IEEE {
	private float radius;
	
	public IEEE(float radius) {
		this.radius = radius;
	}
	public static void main(String[] args) {
		
	}
	
	public strictfp double calculate(Float radius) {
		return 3.14 * radius * radius;
	}
}