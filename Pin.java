import java.util.Scanner;
public class Pin{
	public static void main(String[] a){
		int correctPin=1234;
		int maxAttempt=4;
		int attempt=0;
		Scanner sc=new Scanner(System.in);
		for(attempt = 1; attempt <= maxAttempt;attempt++){
			System.out.println("Enter the PIN:");
			int enteredPin=sc.nextInt();
			if(enteredPin==correctPin){
				System.out.println(" Access Granted");
				attempt=0;
				break;
			}else{
				if(attempt<maxAttempt){
					System.out.println("Incorrect Pin ! Try Again");
				}
			}
		}
		sc.close();
		if(attempt!=0)
			System.out.println("Account Blocked");
	}
}