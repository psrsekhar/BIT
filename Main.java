class Main{
	public static void main(String[] a){
		Student newStd = new Student(new Student(2, "BIT"));
	}
}
class Student{
	private Integer id = 1;
	private String name = "abc";
	
	public Student(Student newData){
		this.id = newData.getId();
		this.name = newData.getName();
	}
	
	public Student(Integer id, String name){
		this.id = id;
		this.name = name;
	}
}
/**
		Student std = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter name:");
		std.setName(sc.nextLine());
		System.out.print("\nenter id:");
		std.setId(sc.nextInt());
		
		StudentMarks sm = new StudentMarks();
		System.out.print("\nenter marks:");
		sm.setFsMarks(sc.nextInt());
		System.out.print("\nenter marks:");
		sm.setSsMarks(sc.nextInt());
		
		
		std.setStudentMarks(sm);
		
		System.out.println("Id: " + std.getId() + "\tName: " + std.getName() 
		+ "\t Subject1: " + std.getStudentMarks().getFsMarks());
		
		sc.close();
*/		