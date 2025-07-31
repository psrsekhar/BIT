class Bank{
	static int balance = 1000;//Instance variable
	public static void main(String[] a){		
		ATM atm = new ATM();
		atm.withdrawl(200);
		UPI upi = new UPI();
		upi.withdrawl(300);
		MB mb = new MB();
		mb.withdrawl(100);
	}
	public void balance(){
		System.out.println("Balance:" + this.balance);
	}
}

class ATM{
	public void withdrawl(int amount){
		Bank bank = new Bank();
		bank.balance = bank.balance - amount;
		bank.balance();
	}
}

class UPI{
	public void withdrawl(int amount){
		Bank bank = new Bank();
		bank.balance = bank.balance - amount;
		bank.balance();		
	}
}

class MB{
	public void withdrawl(int amount){
		Bank bank = new Bank();
		bank.balance = bank.balance - amount;
		bank.balance();
	}
}