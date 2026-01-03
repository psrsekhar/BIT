class Payment {
  double amount;
}
class CardPayment extends Payment {
  String cardNumber;
}
class UPIPayment extends Payment {
  String upiId;
}