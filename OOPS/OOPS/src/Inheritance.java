public class Inheritance {
	public static void main(String[] args) {
		
	}
}

class Parent{
	private Integer age = 20;
	
	public Integer getAge() {
		return this.age;
	}
}

class Child extends Parent{
	private String name = "Samantha";
	
	public String getName() {
		return this.name;
	}
}