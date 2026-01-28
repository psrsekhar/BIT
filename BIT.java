import java.util.LinkedList;
public class  BIT{
	public static void main(String[] a){
		//heterogeneous object - multiple types of data
		LinkedList students = new LinkedList();
		students.add(10);
		students.add("Samantha");
		//homogeneous object - single type of data
		LinkedList<String> actors = new LinkedList<String>();
		actors.add("Samantha");
		Student std = new Student();
		System.out.println(std.id + "||" + std.name + "||" + std.email);
		//fixed number of student records
		Student[] stds = new Student[10];
		//student info with dynamic number of records
		LinkedList<Student> studentList = new LinkedList<Student>();
	}
}
class Student{
	Integer id = 1;
	String name = "Samantha";
	String email = "sam@143.com";
}