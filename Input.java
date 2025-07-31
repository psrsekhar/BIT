import java.util.Scanner;
class Input{
	static{
		System.out.println("In static{} block");
	}
	public static void main(String[] args){
		System.out.println("In main()");
		System.out.println("In main(String[] a)" + args[0]);
		
		Scanner scanner = new Scanner(System.in);//open connection
		
		System.out.println("enter name: ");
		String name = scanner.nextLine(); //read input
		System.out.println("enter age: ");
		Integer age = scanner.nextInt();//read input
		System.out.println("Age:" + age);
		
		scanner.close();//closing connection
	}
}