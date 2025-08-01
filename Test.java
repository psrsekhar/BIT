class Test{
	static Student student = new Student();
	public static void main(String[] args) {
		read();
		getStudentInfo();
	}
	
	public static void read(){
		student.id = 1;
		student.name = "Samantha";
		student.department = "Fashion Technology";
		student.email = "iloveyou@heart.com";
		student.phoneNumber = "+91-9876543210";			
	}
	
	public static void getStudentInfo(){
		System.out.println("Name : " + student.name);
	}
}
class Student{
	public Integer id;
	public String name;
	public String department;
	public String email;
	public String phoneNumber;
	public String address;
}