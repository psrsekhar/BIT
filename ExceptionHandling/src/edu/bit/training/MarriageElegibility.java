package edu.bit.training;

public class MarriageElegibility {

	public static void main(String[] args) {
		int age = 1;
		
		if(age >= 18) {
			System.out.println("Elegible");
		}else {
			try {
				throw new CustomException("Age is less than 18");
			}catch(CustomException ex) {
				ex.printStackTrace();
			}			
		}
	}
}
