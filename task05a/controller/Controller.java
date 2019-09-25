package by.htp.les10.main.task05a.controller;

import by.htp.les10.main.task05a.command.Command;
import by.htp.les10.main.task05a.command.CommandProvider;
import by.htp.les10.main.task05a.service.ServiceException;

public class Controller {
	
	private final CommandProvider provider = new CommandProvider();
	
	public String doAction(String request) {
		
		String commandName;
		Command command;
		String response;
		
		commandName = request.split(" ")[0];
		
		command = provider.getCommand(commandName);
		
		try {
			response = command.execute(request);
		} catch (ServiceException e) {
			response = e.getMessage();;
		}
		
		return response;
		
	}

}
