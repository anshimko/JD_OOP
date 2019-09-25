package by.htp.les10.main.task02;

import java.util.ArrayList;
import java.util.List;

public class Payment {

	private List<Order> orders;

	public Payment() {
		orders = new ArrayList<Order>();
	}

	public Payment(List<Order> orders) {
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void add(Order order) {
		this.getOrders().add(order);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orders == null) ? 0 : orders.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (orders == null) {
			if (other.orders != null)
				return false;
		} else if (!orders.equals(other.orders))
			return false;
		return true;
	}

	class Order {

		private String name;
		private int count;
		private int price;

		public Order(String name, int count, int price) {
			this.name = name;
			this.count = count;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + count;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + price;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Order other = (Order) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (count != other.count)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (price != other.price)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Order [name=" + name + ", count=" + count + ", price="
					+ price + "]";
		}

		private Payment getEnclosingInstance() {
			return Payment.this;
		}

	}
	
	public void add (String name, int count, int price) {
		orders.add(new Order(name, count, price));
	}
}
