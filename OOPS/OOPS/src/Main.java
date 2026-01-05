
public class Main {

	public static void main(String[] args) {
		Test test = new Test();
		test.setName("Samantha");
		test.setAge(20);
		test.display();
		
		Test test2 = new Test("Trisha", 25);
		test2.display();
		
		Test test3 = new Test(test);
		
	}
}

class Test {
	private String name;
	private Integer age;
	
	//default constructor
	public Test() {
		//super(); -> parent class (if any) constructor is called implicitly
		System.out.println("In Test()....");
	}
	
	//parameterized constructor
	public Test(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	//copy constructor
	public Test(Test newTest) {
		this.name = newTest.getName();
		this.age = newTest.getAge();
	}
	
	//private constructor
	//private Test() {}

	public void display() {
		System.out.println("Name: " + this.name + "\tAge: " + this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}