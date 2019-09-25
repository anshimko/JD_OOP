package by.htp.les10.main.task05a.command.impl;

import by.htp.les10.main.task05a.command.Command;
import by.htp.les10.main.task05a.service.BouquetService;
import by.htp.les10.main.task05a.service.ServiceException;
import by.htp.les10.main.task05a.service.ServiceProvider;

public class AddCoverCommand implements Command{

	@Override
	public String execute(String request) {
		String[] params;
		params = request.split(" ");
		
		
		String nameBouquet;
		String name;
		String price;
		
		nameBouquet = params[1].split("=")[1];
		name = params[2].split("=")[1];
		price =  params[3].split("=")[1];

		ServiceProvider provider = ServiceProvider.getInstance();
		BouquetService bouqCreator = provider.getBouquetService();

		String response;

		try {
			boolean result;
			result = bouqCreator.addCover(nameBouquet, name, Integer.parseInt(price));
			response = result ? "Упаковка добавлена" : "Упаковка не добавлена";
			
		} catch (ServiceException e) {
			response = e.getMessage();
		}

		return response;
	}

}
