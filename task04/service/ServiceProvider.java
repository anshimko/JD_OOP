package by.htp.les10.main.task04.service;

import by.htp.les10.main.task04.service.impl.TreasureServiceImpl;

public class ServiceProvider {
	
	private static final ServiceProvider INSTANCE = new ServiceProvider();
		
	private ServiceProvider() {}

	public static ServiceProvider getInstance() {
		return INSTANCE;
	}
	
	private TreasureService treasureService = new TreasureServiceImpl();
	
	public TreasureService getTreasureService () {
		return treasureService;
	}
	
	

}
