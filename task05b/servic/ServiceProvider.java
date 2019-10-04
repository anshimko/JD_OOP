package by.htp.les10.main.task05b.servic;

import by.htp.les10.main.task05b.service.impl.GiftServiceImpl;

public class ServiceProvider {

	private final static ServiceProvider instance = new ServiceProvider();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	private GiftService giftService = new GiftServiceImpl();

	public GiftService getGiftService() {
		return giftService;
	}

}
