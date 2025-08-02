import java.util.Scanner;
class HDFC{
	static Integer choice;
	static Integer amount;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] a){
		while(true){
			showMenu();
			getUserInput();
			operations();
		}
	}
	
	public static void showMenu(){
		System.out.println("\n1.Deposit\n2.Withdrawl\n3.Balance\n4.PIN Reset\n5.Exit");
	}
	
	public static void getUserInput(){
		System.out.print("enter your choice:");
		choice = scanner.nextInt();
	}
	
	public static void getAmount(){
		System.out.print("enter amount:");
		amount = scanner.nextInt();
	}
	
	public static void operations(){
		TransactionService ts = new TransactionService();
		switch(choice){
			case 1: System.out.println("Deposit Selected");
					getAmount();
					ts.deposit(amount);
					break;
			case 2: System.out.println("Withdrawl Selected");
					getAmount();
					ts.withdrawl(amount);
					break;
			case 3: System.out.println("Balance Selected");
					System.out.println("Account Balance: " + ts.balance());
					break;
			case 4: System.out.println("PIN Reset Selected");
					ts.resetPIN(0143);
					break;
			case 5: System.out.println("Terminating the program....");
					System.exit(0);
			default:System.out.println("Invalid choice");System.exit(0);
		}
	}
}

class TransactionService{
	static Integer balance = 100;
	static Integer PIN = 1430;

	public void deposit(Integer amount){
		this.balance += amount;
	}
	
	public void withdrawl(Integer amount){
		if(balance() >= amount){
			this.balance -= amount;
		}else{
			System.out.println("Insufficient Balance.");
		}
	}

	public Integer balance(){
		return this.balance;
	}
	
	public void resetPIN(Integer newPIN){
		this.PIN = newPIN;
	}
}