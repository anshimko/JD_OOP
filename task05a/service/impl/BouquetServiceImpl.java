package by.htp.les10.main.task05a.service.impl;

import by.htp.les10.main.task05a.bean.Bouquet;
import by.htp.les10.main.task05a.bean.Cover;
import by.htp.les10.main.task05a.bean.Flower;
import by.htp.les10.main.task05a.bean.GardenFlower;
import by.htp.les10.main.task05a.bean.WildFlower;
import by.htp.les10.main.task05a.service.BouquetService;
import by.htp.les10.main.task05a.service.ServiceException;
import by.htp.les10.main.task05a.service.util.Validator;

public class BouquetServiceImpl implements BouquetService {

	@Override
	public Bouquet createBouquet() {
		return new Bouquet();
	}

	@Override
	public boolean addCover(Bouquet bouquet, String name, int price) throws ServiceException {

		if (!Validator.validParam(name, price)) {
			throw new ServiceException("Названия или цена указано не верно");
		}

		Cover cover = new Cover(name, price);
		bouquet.setPack(cover);

		return true;
	}

	@Override
	public boolean addWildFlower(Bouquet bouquet, String name, String color, int price, boolean forestFlower)
			throws ServiceException {

		if (!Validator.validParam(name, price)) {
			throw new ServiceException("Названия или цена указано не верно");
		}

		WildFlower wildFlower = new WildFlower(name, color, price, forestFlower);
		bouquet.getBouquet().add(wildFlower);

		return true;
	}

	@Override
	public boolean addGardenFlower(Bouquet bouquet, String name, String color, int price, boolean springFlower)
			throws ServiceException {

		if (!Validator.validParam(name, price)) {
			throw new ServiceException("Названия или цена указано не верно");
		}

		GardenFlower gardenFlower = new GardenFlower(name, color, price, springFlower);
		bouquet.getBouquet().add(gardenFlower);

		return true;
	}

}
