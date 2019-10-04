package by.htp.les10.main.task05b.servic;

import by.htp.les10.main.task05b.bean.Gift;

public interface GiftService {

	public Gift createGift();

	public boolean addCandy(Gift gift, String name, int price, boolean chocolateCandy) throws ServiceException;

	public boolean addIceCream(Gift gift, String name, int price, boolean containsNuts) throws ServiceException;

	public boolean addCover(Gift gift, String name, int price) throws ServiceException;

	public int totalPrice(Gift gift);

}
