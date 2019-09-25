package by.htp.les10.main.task02;

public class PaymentLogic {
	
	public int takeSumPayment (Payment payment) {
		int sum = 0;
		for(Payment.Order orders : payment.getOrders()) {
			sum = sum + (orders.getCount() * orders.getPrice());
		}
		return sum;
	}

}
