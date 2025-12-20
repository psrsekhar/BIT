package edu.bit;

//Legacy Payment Service with incompatible interface
class OldGateway {
	public void processing(Integer amount) {
		System.out.println("Payment for amount : " + amount + " is processed using Payu Gateway");
	}
}


//New interface or Payment Service expected by application
interface PaymentProcessor{
	public void paymentProcessing(Integer amount);
}

//Adapter class to integrate OldGateway with new Payment Processor
class PaymentAdapter implements PaymentProcessor{
	private OldGateway oldGateway;
	public PaymentAdapter(OldGateway oldGateway) {
		this.oldGateway = oldGateway;
	}
	
	@Override
	public void paymentProcessing(Integer amount) {
		oldGateway.processing(amount);
	}
}

//Client
public class Gateway{
	public static void main(String[] a) {
		PaymentProcessor paymentProcessor = new PaymentAdapter(new OldGateway());
		paymentProcessor.paymentProcessing(10000000);
	}
}






