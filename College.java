class  BIT{
	public static void main(String[] a){
		Student std = new Student(1, "samantha", "sam@143.com");
		System.out.println(std);
	}
}
//Encapsulated or Model class
class Student{
	//Instance variables - new memory will be created for every object
	// Data hiding
	private Integer id;
	private String name;
	private String email;
	//default constructor
	public Student(){ 
		System.out.println("Student() is called...");
	}
	//parameterized constructor
	public Student(Integer id, String name, String email){
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public String toString(){
		return "{ID: " + this.id  + ", Name: " + this.name + ", Email: " + this.email + "}";
	}
}
	/**private constructor
	private Student(){ 
		System.out.println("Student() is called...");
	}*/
	/**copy constructor
	public Student(Student oldStudent){
		this.id = oldStudent.getId();
		this.name = oldStudent.getName();
		this.email = oldStudent.getEmail();
	}*/
}