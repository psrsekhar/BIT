interface Payment {
  void pay(double amount);
}
class CardPayment implements Payment {
  public void pay(double amount) {
    System.out.println("The amount is paid using card : " + amount);
  }
}
class UPIPayment implements Payment {
  public void pay(double amount) {
    System.out.println("The amount is paid using UPI Id : " + amount);
  }
}
class Cart {
  Payment payment;
  Cart(Payment payment) {
    this.payment = payment;
  }
  public void checkout(double amount) {
    payment.pay(amount);
  }
}
class LooselyCouplingDemo {
  public static void main(String[] args) {
    Payment payment = new UPIPayment();
    Cart cart = new Cart(payment);
    cart.checkout(5000.00);
  }
}
