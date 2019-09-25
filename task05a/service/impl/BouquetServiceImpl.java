package by.htp.les10.main.task05a.service.impl;

import java.util.List;

import by.htp.les10.main.task05a.bean.Bouquet;
import by.htp.les10.main.task05a.bean.BouquetCreator;
import by.htp.les10.main.task05a.bean.Cover;
import by.htp.les10.main.task05a.bean.Flower;
import by.htp.les10.main.task05a.service.BouquetService;
import by.htp.les10.main.task05a.service.ServiceException;
import by.htp.les10.main.task05a.service.util.Validator;

public class BouquetServiceImpl implements BouquetService {

	@Override
	public boolean createBouquet(String name) throws ServiceException {
		
		if (!Validator.validBouquet(name)) {
			throw new ServiceException("Имя букета указано не верно");
		}
		
		Bouquet bouquet = new Bouquet(name);
		BouquetCreator.getInstance().getBouquets().add(bouquet);
		return true;
	}

	@Override
	public boolean addCover(String nameBouquet, String name, int price) throws ServiceException {

		if (!Validator.validCover(name)) {
			throw new ServiceException("Имя упаковки указано не верно");
		}
		
		try {
		Cover cover = new Cover(name, price);
		BouquetCreator bouqCreator = BouquetCreator.getInstance();
		
		Bouquet bouquet = takeBouquetName(bouqCreator.getBouquets(), nameBouquet);
		bouquet.setPack(cover);
		
		} catch (Exception e) {
			throw new ServiceException("Упаковка не добавлена");
		}
		
		return true;
	}

	@Override
	public boolean addFlower(String nameBouquet, String name, String color, int price) throws ServiceException {

		if (!Validator.validFlower(name)) {
			throw new ServiceException("Имя цветка указано не верно");
		}
		
		try {
		Flower flower = new Flower(name, color, price);
		BouquetCreator bouqCreator = BouquetCreator.getInstance();
		
		Bouquet bouquet = takeBouquetName(bouqCreator.getBouquets(), nameBouquet);
		bouquet.getBouquet().add(flower);
		} catch (Exception e) {
			throw new ServiceException("Цветок не добавлен");
		}
		return true;
	}

	private static Bouquet takeBouquetName(List<Bouquet> bouquetsList, String name) {
		Bouquet bouquet = null;
		for (Bouquet bq : bouquetsList) {
			if (name.equals(bq.getName())) {
				bouquet = bq;
			}
		}
		return bouquet;
	}

	@Override
	public String takeBouquet(String name) {
		BouquetCreator bouqCreator = BouquetCreator.getInstance();
		Bouquet bouquet = null;
		for (Bouquet bq : bouqCreator.getBouquets()) {
			if (name.equals(bq.getName())) {
				bouquet = bq;
			}
		}
		return bouquet.toString();
	}
}
