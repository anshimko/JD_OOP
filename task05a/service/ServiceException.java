package by.htp.les10.main.task05a.service;

@SuppressWarnings("serial")
public class ServiceException extends Exception{
	
	public ServiceException() {
		super();
	}
	
	public ServiceException(Exception e) {
		super(e);
	}
	
	public ServiceException(String message) {
		super(message);
	}

}
