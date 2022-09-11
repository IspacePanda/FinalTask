package by.tc.task01.service;

public class ServiceException extends Exception {
;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1059395106319285160L;
	
	private static final String e = null;

	public ServiceException() {
		super(e);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Exception e) {
		super(e);
	}

	public ServiceException(String message, Exception e) {
		super(message, e);
	}

}