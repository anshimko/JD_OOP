package by.htp.les10.main.task05a.bean;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

	private List<Flower> bouquet;
	private Cover cover;

	public Bouquet() {
		this.bouquet = new ArrayList<Flower>();
		this.cover = new Cover();
	}

	public Bouquet(List<Flower> bouquet, Cover pack) {
		this.bouquet = bouquet;
		this.cover = pack;
	}

	public List<Flower> getBouquet() {
		return bouquet;
	}

	public void setBouquet(List<Flower> bouquet) {
		this.bouquet = bouquet;
	}

	public Cover getPack() {
		return cover;
	}

	public void setPack(Cover pack) {
		this.cover = pack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bouquet == null) ? 0 : bouquet.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
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
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bouquet [bouquet=" + takeFlower(bouquet) + ", pack=" + cover + "]";
	}

	private static String takeFlower(List<Flower> bouquet) {
		String flower = new String();
		for (Flower fl : bouquet) {
			flower = flower.concat(fl.toString() + ", ");
		}
		return flower;

	}

}
