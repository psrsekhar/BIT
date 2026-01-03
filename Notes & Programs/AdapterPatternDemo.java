// legacy payment gateway which is not compatible with PaymentProcessor
class LegacyPaymentGateway {
  public void makePayment(double amount) {
    System.out.println("Amount is paid using legacy payment gateway : " + amount);
  }
}

// new payment system
interface PaymentProcessor {
  public void processPayment(double amount);
}

// new payment processor which is compatible with PaymentProcessor
class PaypalPaymentProcessor implements PaymentProcessor {
  public void processPayment(double amount) {
    System.out.println("Amount is paid using Paypal : " + amount);
  }
}

// adapter for LegacyPaymentGateway and compatible with PaymentProcessor 
class LegacyPaymentGatewayAdapter implements PaymentProcessor {
  private LegacyPaymentGateway legacyGateway;
  
  LegacyPaymentGatewayAdapter(LegacyPaymentGateway legacyGateway) {
    this.legacyGateway = legacyGateway;
  }
  public void processPayment(double amount) {
    legacyGateway.makePayment(amount);
  }
}

// client application
class Test {
  public static void main(String[] args) {
    PaymentProcessor processor = new LegacyPaymentGatewayAdapter(new LegacyPaymentGateway());
    processor.processPayment(5550.0);
  }
}



//System.out.println();
