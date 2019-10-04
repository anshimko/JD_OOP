package by.htp.les10.main.task05a.bean;

public class WildFlower extends Flower {

	private boolean ForestFlower;

	public WildFlower(String name, String color, int price, boolean forestFlower) {
		super(name, color, price);
		ForestFlower = forestFlower;
	}

	public boolean isForestFlower() {
		return ForestFlower;
	}

	public void setForestFlower(boolean forestFlower) {
		ForestFlower = forestFlower;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (ForestFlower ? 1231 : 1237);
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
		WildFlower other = (WildFlower) obj;
		if (ForestFlower != other.ForestFlower)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WildFlower [Name=" + getName() + ", Color=" + getColor() + ", Price=" + getPrice() + ", ForestFlower="
				+ ForestFlower + "]";
	}

}
