package by.htp.les10.main.task05a.service;

public interface BouquetService {
	
	public boolean createBouquet (String name) throws ServiceException;
	public boolean addCover(String nameBouquet, String name, int price) throws ServiceException;
	public boolean addFlower(String nameBouquet, String name, String color, int price) throws ServiceException;
	public String takeBouquet (String name);

}
