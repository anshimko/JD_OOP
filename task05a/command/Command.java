package by.htp.les10.main.task05a.command;

import by.htp.les10.main.task05a.service.ServiceException;

public interface Command {
	
	String execute(String request) throws ServiceException;

}
