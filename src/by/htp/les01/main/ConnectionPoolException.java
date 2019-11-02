package by.htp.les01.main;

public class ConnectionPoolException extends Exception {

	private static final long serialVersionUID = 1L;

	public ConnectionPoolException(String message, Exception e) {
		super(message, e);
	}

}
