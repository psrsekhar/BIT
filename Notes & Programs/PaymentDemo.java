interface Payment {
  public abstract void pay(double amount);
}

class CardPayment implements Payment {
  public void pay(double amount) {
    System.out.println("Payment is processed using card : " + amount);
  }
}

class UPIPayment implements Payment {
  public void pay(double amount) {
    System.out.println("Payment is processed using UPI : " + amount);
  }
}

class PaymentDemo {
  public static void main(String[] args) {
    Payment p = new CardPayment();
    p.pay(550.00);

    Payment p2 = new UPIPayment();
    p2.pay(1099.00);
  }
}



