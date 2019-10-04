package by.htp.les10.main.task05a.service;

import by.htp.les10.main.task05a.bean.Bouquet;

public interface BouquetService {

	public Bouquet createBouquet();

	public boolean addCover(Bouquet bouquet, String name, int price) throws ServiceException;

	public boolean addWildFlower(Bouquet bouquet, String name, String color, int price, boolean ForestFlower)
			throws ServiceException;

	public boolean addGardenFlower(Bouquet bouquet, String name, String color, int price, boolean SpringFlower)
			throws ServiceException;

}
