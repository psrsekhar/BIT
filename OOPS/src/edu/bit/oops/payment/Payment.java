package edu.bit.oops.payment;

public class Payment {
	private String orderId;
	private String transactionId;
	private Integer userId;
	private Float amount;
	private Integer paymentMode;

	public Payment() {
	}

	public Payment(String orderId, String transactionId, Integer userId, Float amount, Integer paymentMode) {
		super();
		this.orderId = orderId;
		this.transactionId = transactionId;
		this.userId = userId;
		this.amount = amount;
		this.paymentMode = paymentMode;
	}
	
	//set and get methods for instance variables
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		if(amount > 0) {
			this.amount = amount;	
		}else {
			throw new IllegalArgumentException();
		}
	}

	public Integer getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(Integer paymentMode) {
		this.paymentMode = paymentMode;
	}

}

//parent
interface PaymentService {
	public void savePayment(Payment payment);// abstract method
}

//child
class PaymentServiceImpl implements PaymentService {

	@Override
	public void savePayment(Payment payment) {
		// code to save payment info
	}
}