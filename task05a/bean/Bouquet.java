package by.htp.les10.main.task05a.bean;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

	private String name;
	private List<Flower> bouquet;
	private Cover pack;

	public Bouquet(String name) {
		this.name = name;
		this.bouquet = new ArrayList<Flower>();
		this.pack = new Cover("", 0);
	}

	public Bouquet(List<Flower> bouquet, Cover pack) {
		this.bouquet = bouquet;
		this.pack = pack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Flower> getBouquet() {
		return bouquet;
	}

	public void setBouquet(List<Flower> bouquet) {
		this.bouquet = bouquet;
	}

	public Cover getPack() {
		return pack;
	}

	public void setPack(Cover pack) {
		this.pack = pack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bouquet == null) ? 0 : bouquet.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pack == null) ? 0 : pack.hashCode());
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
		Bouquet other = (Bouquet) obj;
		if (bouquet == null) {
			if (other.bouquet != null)
				return false;
		} else if (!bouquet.equals(other.bouquet))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pack == null) {
			if (other.pack != null)
				return false;
		} else if (!pack.equals(other.pack))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bouquet [name=" + name + ", bouquet=" + takeFlower(bouquet) + ", pack=" + pack + "]";
	}
	
	private static String takeFlower (List<Flower> bouquet) {
		String flower = new String();
		for(Flower fl : bouquet) {
			flower = flower.concat(fl.toString() + ", ");
		}
		return flower;
		
	}

	
	
	

}
