import java.util.Scanner;

class ATM{
	public static void main(String[] args){
		UI ui = new UI();
		while(true){
			ui.showMenu();			
			ui.transaction(ui.getUserChoice());
		}
	}
}

class UI{
	Scanner sc = new Scanner(System.in);
	private Integer amount = 0;
	
	public void showMenu(){
		System.out.print("\n1.Deposit\n2.Withdraw\n3.Balance\n4.Exit");
	}
	
	public Integer getUserChoice(){
		System.out.print("\nenter your choice: ");
		return sc.nextInt();
	}
	
	public void transaction(Integer choice){
		Transaction tr = new Transaction();
		switch(choice){
			case 1: amount = getAmount();
					if(tr.deposit(amount)){
						System.out.println("Amount deposited.");
					}else{
						System.out.println("Deposit failed.");
					}
					break;			
			case 2: amount = getAmount();
					if(tr.withDraw(amount)){
						System.out.println("Amount withdrawn.");
					}else{
						System.out.println("Withdrawl failed.");
					}
					break;
			case 3: System.out.println("Balance is: " + tr.getBalance());
					break;
			case 4: System.out.println("Application is terminating....");
					System.exit(0);
			default: System.out.println("Invalid choice");
					break;
		}
	}
	
	private Integer getAmount(){
		System.out.print("\nenter amount: ");
		return sc.nextInt();		
	}
}

class Transaction{
	private static Integer balance = 1000;
	
	public Boolean deposit(Integer amount){
		Boolean isDeposited = false;
		if(amount > 0){
			balance += amount;
			isDeposited = true;
		}
		return isDeposited;
	}
	
	public Boolean withDraw(Integer amount){
		Boolean isDeducted = false;
		if(amount > 0 && getBalance() >= amount){
			balance -= amount;
			isDeducted = true;
		}
		return isDeducted;
	}	
	
	public Integer getBalance(){
		return balance;
	}
}