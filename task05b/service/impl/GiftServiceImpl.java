package by.htp.les10.main.task05b.service.impl;

import by.htp.les10.main.task05b.bean.Candy;
import by.htp.les10.main.task05b.bean.Cover;
import by.htp.les10.main.task05b.bean.Gift;
import by.htp.les10.main.task05b.bean.IceCream;
import by.htp.les10.main.task05b.bean.Sweetness;
import by.htp.les10.main.task05b.servic.GiftService;
import by.htp.les10.main.task05b.servic.ServiceException;
import by.htp.les10.main.task05b.service.util.Validator;

public class GiftServiceImpl implements GiftService {

	public Gift createGift() {
		return new Gift();
	}

	public boolean addCandy(Gift gift, String name, int price, boolean chocolateCandy) throws ServiceException {

		if (!Validator.validParam(name, price)) {
			throw new ServiceException("Имя или цена указаны не верно");
		}

		gift.getSweetness().add(new Candy(name, price, chocolateCandy));
		return true;
	}

	public boolean addIceCream(Gift gift, String name, int price, boolean containsNuts) throws ServiceException {

		if (!Validator.validParam(name, price)) {
			throw new ServiceException("Имя или цена указаны не верно");
		}

		gift.getSweetness().add(new IceCream(name, price, containsNuts));
		return true;
	}

	public boolean addCover(Gift gift, String name, int price) throws ServiceException {

		if (!Validator.validParam(name, price)) {
			throw new ServiceException("Имя или цена указаны не верно");
		}

		gift.setCover(new Cover(name, price));
		return true;
	}

	public int totalPrice(Gift gift) {
		int price = 0;
		price = gift.getCover().getPrice();
		for (Sweetness sw : gift.getSweetness()) {
			price = price + sw.getPrice();
		}
		return price;
	}

}
