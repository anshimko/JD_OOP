package by.htp.les10.main.task05a.bean;

public class GardenFlower extends Flower {

	private boolean SpringFlower;

	public GardenFlower(String name, String color, int price, boolean springFlower) {
		super(name, color, price);
		SpringFlower = springFlower;
	}

	public boolean isSpringFlower() {
		return SpringFlower;
	}

	public void setSpringFlower(boolean springFlower) {
		SpringFlower = springFlower;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (SpringFlower ? 1231 : 1237);
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
		GardenFlower other = (GardenFlower) obj;
		if (SpringFlower != other.SpringFlower)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GardenFlower [Name=" + getName() + ", Color=" + getColor() + ", Price=" + getPrice() + ", SpringFlower="
				+ SpringFlower + "]";
	}

}
