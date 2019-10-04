package by.htp.les10.main.task05b.servic;

@SuppressWarnings("serial")
public class ServiceException extends Exception{
	
	public ServiceException(Exception e) {
		super(e);
	}
	
	public ServiceException() {
		super();
	}
	
	public ServiceException(String message) {
		super(message);
	}

}
