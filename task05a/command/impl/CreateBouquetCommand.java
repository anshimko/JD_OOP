package by.htp.les10.main.task05a.command.impl;

import by.htp.les10.main.task05a.command.Command;
import by.htp.les10.main.task05a.service.BouquetService;
import by.htp.les10.main.task05a.service.ServiceException;
import by.htp.les10.main.task05a.service.ServiceProvider;

public class CreateBouquetCommand implements Command {

	@Override
	public String execute(String request) {
		String[] params;
		params = request.split(" ");

		String name;

		name = params[1].split("=")[1];

		ServiceProvider provider = ServiceProvider.getInstance();
		BouquetService bouqCreator = provider.getBouquetService();

		String response;

		try {
			boolean result;
			result = bouqCreator.createBouquet(name);
			response = result ? "Букет создан" : "Букет не создан";
		} catch (ServiceException e) {
			response = e.getMessage();
		}

		return response;
	}

}
