package by.htp.les10.main.task04.bean;

import java.util.ArrayList;
import java.util.List;

public class Cave {

	private List<Treasure> cave;

	public Cave() {
		cave = new ArrayList<Treasure>();
	}

	public Cave(List<Treasure> cave) {
		this.cave = cave;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cave == null) ? 0 : cave.hashCode());
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
		Cave other = (Cave) obj;
		if (cave == null) {
			if (other.cave != null)
				return false;
		} else if (!cave.equals(other.cave))
			return false;
		return true;
	}

}
