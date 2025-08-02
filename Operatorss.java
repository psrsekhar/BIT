import java.util.Scanner;
class Operators{
    static Integer choice,firstNumber,secondNumber;
	static Scanner scanner = new Scanner(System.in);
    public static void main(String[] a){
		while(true){
			showMenu();
			getUserchoice();
			operations();
		}
	}	
	
	public static void showMenu(){
	    System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5. Exit");
	}

    public static void getUserchoice(){
	    System.out.println("Enter your choice: ");
		choice=scanner.nextInt();
	}
	
	 public static void getUserInput(){
	    System.out.println("Enter firstNumber Number: ");
		firstNumber=scanner.nextInt();
		System.out.println("Enter secondNumber Number: ");
		secondNumber=scanner.nextInt();
	}
	
	public static void operations(){
	    switch(choice){
		    case 1: getUserInput();
					System.out.println("Addition:" + (firstNumber+secondNumber));
		            break;
		    case 2: getUserInput();
					System.out.println("Subtraction:" + (firstNumber-secondNumber));
		            break;
		   	case 3: getUserInput();
					System.out.println("Multiplication:" + (firstNumber*secondNumber));
		            break;
			case 4: getUserInput();
					System.out.println("Division:" + (firstNumber/secondNumber));
		            break;
			case 5: 
			default:
					System.out.println("Terminating the program....");
					scanner.close();
					System.exit(0);
		}
    }
}