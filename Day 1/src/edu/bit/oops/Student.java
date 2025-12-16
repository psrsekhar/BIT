package edu.bit.oops;

public class Student {
	Integer id;
	String name;
	
	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
	   	return this.id + " " + this.name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
