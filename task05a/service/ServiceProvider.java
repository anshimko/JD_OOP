package by.htp.les10.main.task05a.service;

import by.htp.les10.main.task05a.service.impl.BouquetServiceImpl;

public class ServiceProvider {
	
	private static final ServiceProvider instance = new ServiceProvider();
	
	private ServiceProvider() {};
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	private BouquetService bouquetService = new BouquetServiceImpl();
	
	public BouquetService getBouquetService() {
		return bouquetService;
	}

}
