class Inheritance{
	public static void main(String[] a){
		//child class object
		OrderProcessing op = new OrderProcessing();
		op.saveOrder(); //child class method
		op.sendMail();//parent class method
	}
}
//parent class
class Notification{
	public void sendMail(){
		System.out.println("Order details sent to customer");
	}
}
//child class
class OrderProcessing extends Notification{
	public void saveOrder(){
		System.out.println("Saving order info into DB");
		System.out.println("Generating invoice");
	}
}