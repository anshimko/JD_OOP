package by.htp.les10.main.task05a.bean;

import java.util.ArrayList;
import java.util.List;

public class BouquetCreator {
	
	private static final BouquetCreator INSTANCE = new BouquetCreator();
		
	private List<Bouquet> bouquets;

	private BouquetCreator() {
		this.bouquets = new ArrayList<Bouquet>();
	}
	
	public List<Bouquet> getBouquets() {
		return bouquets;
	}



	public static BouquetCreator getInstance() {
		return INSTANCE;
	}
	
	
	
	

}
