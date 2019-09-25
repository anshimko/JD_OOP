package by.htp.les10.main.task02;

/*Задача 2.
 Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */

public class Main {

	public static void main(String[] args) {

		Payment payment = new Payment();

		payment.add("Bread", 2, 2);
		payment.add("Milk", 1, 1);
		payment.add("Water", 5, 1);
		payment.add("Cheese", 1, 6);
		payment.add("Meat", 2, 10);

		PaymentLogic payLog = new PaymentLogic();
		System.out.println("Sum of payment: " + payLog.takeSumPayment(payment));

		print(payment);

	}

	public static void print(Payment payment) {
		for (Payment.Order orders : payment.getOrders()) {
			System.out.println(orders.toString());
		}
	}

}
