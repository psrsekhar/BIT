public class Encapsulation {

	public static void main(String[] args) {
		Student student = new Student(1, "Samantha", "sam@143.com");
		System.out.println(student);// Student class toString() is called
	}
}

//Model or Entity Class or Encapsulated class
class Student {
	//Data Hiding
	private Integer id;
	private String name;
	private String email;
	
	public Student() {}

	public Student(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return this.id + "-" + this.name + "-" + this.email;
	}

	//set and get methods
}