import java.util.Scanner;
class Input{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter name: ");
		String name = sc.nextLine();
		System.out.print("enter age: ");
		Integer age = sc.nextInt();
		sc.close();
		
		System.out.println("Id: " + id + "\tName: " + name);
	}
}