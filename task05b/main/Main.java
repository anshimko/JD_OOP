package by.htp.les10.main.task05b.main;

import by.htp.les10.main.task05b.bean.Gift;
import by.htp.les10.main.task05b.bean.Sweetness;
import by.htp.les10.main.task05b.servic.GiftService;
import by.htp.les10.main.task05b.servic.ServiceException;
import by.htp.les10.main.task05b.servic.ServiceProvider;

/*Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
подарок). Составляющими целого подарка являются сладости и упаковка
*/

public class Main {

	public static void main(String[] args) {

		ServiceProvider provider = ServiceProvider.getInstance();
		GiftService service = provider.getGiftService();

		Gift happyBirhday = service.createGift();

		try {
			service.addCandy(happyBirhday, "Roshen", 11, true);
			service.addCandy(happyBirhday, "Mars", 8, false);
			service.addCandy(happyBirhday, "Snickers", 7, true);
			service.addIceCream(happyBirhday, "Milk", 29, false);
			service.addCover(happyBirhday, "Box", 15);
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		}

		int price = service.totalPrice(happyBirhday);
		System.out.println("Цена букета = " + price);

		print(happyBirhday);

	}

	static void print(Gift gift) {

		for (Sweetness sw : gift.getSweetness()) {
			System.out.println(sw.toString());
		}

		System.out.println(gift.getCover().toString());
	}
}
