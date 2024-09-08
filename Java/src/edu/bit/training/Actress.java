package edu.bit.training;

public class Actress {
	private String name;
	private Integer age;
	private Integer numberOfMovies;

	public Actress(String name, Integer age, Integer numberOfMovies) {
		this.name = name;
		this.age = age;
		this.numberOfMovies = numberOfMovies;
	}
	
	@Override
	public String toString() {
		return "{" + this.name + "," + this.age + "," + this.numberOfMovies + "}";
	}
	
	@Override
	public int hashCode() {
		System.out.println("In my hashCode()....");
		int result = 17;
		result = 31 * result + name.hashCode();
		System.out.println("Result : " + result);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Actress actress = (Actress)obj;
		return this.name.equals(actress.name) && this.age == actress.age && this.numberOfMovies == actress.numberOfMovies;
	}
}
/**
public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
*/