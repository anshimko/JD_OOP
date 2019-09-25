package by.htp.les10.main.task05a.command.impl;

import by.htp.les10.main.task05a.command.Command;
import by.htp.les10.main.task05a.service.BouquetService;
import by.htp.les10.main.task05a.service.ServiceException;
import by.htp.les10.main.task05a.service.ServiceProvider;

public class AddFlowerCommand implements Command{

	@Override
	public String execute(String request) throws ServiceException {
		String[] params;
		params = request.split(" ");
		
		
		String nameBouquet;
		String name;
		String color;
		String price;
		
		nameBouquet = params[1].split("=")[1];
		name = params[2].split("=")[1];
		color = params[2].split("=")[1];
		price =  params[4].split("=")[1];

		ServiceProvider provider = ServiceProvider.getInstance();
		BouquetService bouqCreator = provider.getBouquetService();

		String response;

		try {
			boolean result;
			result = bouqCreator.addFlower(nameBouquet, name, color, Integer.parseInt(price));
			response = result ? "Цветок добавлен" : "Цветок не добавлен";
			
		} catch (ServiceException e) {
			response = e.getMessage();
		}

		return response;
	
	}

}
