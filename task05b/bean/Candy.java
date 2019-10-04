package by.htp.les10.main.task05b.bean;

public class Candy extends Sweetness {

	private boolean ChocolateCandy;

	public Candy() {
	}

	public Candy(String name, int price, boolean chocolateCandy) {
		super(name, price);
		ChocolateCandy = chocolateCandy;
	}

	public boolean isChocolateCandy() {
		return ChocolateCandy;
	}

	public void setChocolateCandy(boolean chocolateCandy) {
		ChocolateCandy = chocolateCandy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (ChocolateCandy ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candy other = (Candy) obj;
		if (ChocolateCandy != other.ChocolateCandy)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Candy [ChocolateCandy=" + ChocolateCandy + ", Name=" + getName() + ", Price=" + getPrice()
				+ "]";
	}

}
