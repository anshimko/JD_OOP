package by.htp.les10.main.task05a.main;

import by.htp.les10.main.task05a.bean.Bouquet;
import by.htp.les10.main.task05a.service.BouquetService;
import by.htp.les10.main.task05a.service.ServiceException;
import by.htp.les10.main.task05a.service.ServiceProvider;

public class Main {

	public static void main(String[] args) {

		ServiceProvider provider = ServiceProvider.getInstance();
		BouquetService service = provider.getBouquetService();

		Bouquet bouquet = service.createBouquet();

		try {
			service.addCover(bouquet, "Plant", 16);
			service.addGardenFlower(bouquet, "Tulip", "blue", 11, true);
			service.addWildFlower(bouquet, "Chamomile", "white", 7, false);
			service.addGardenFlower(bouquet, "Rose", "yellow", 19, true);

		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(bouquet.toString());

	}

}
