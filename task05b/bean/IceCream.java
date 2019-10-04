package by.htp.les10.main.task05b.bean;

public class IceCream extends Sweetness {

	private boolean containsNuts;
	
	public IceCream() {
	}

	public IceCream(String name, int price, boolean containsNuts) {
		super(name, price);
		this.containsNuts = containsNuts;
	}

	public boolean isContainsNuts() {
		return containsNuts;
	}

	public void setContainsNuts(boolean containsNuts) {
		this.containsNuts = containsNuts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (containsNuts ? 1231 : 1237);
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
		IceCream other = (IceCream) obj;
		if (containsNuts != other.containsNuts)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IceCream [containsNuts=" + containsNuts + ", Name=" + getName() + ", Price=" + getPrice()
				+ "]";
	}

}
