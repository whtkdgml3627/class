package chapter10.except;

public class BadIdInputException extends Exception {

	public BadIdInputException() {
		super();
	}

	public BadIdInputException(String message) {
		super(message);
	}
	
}
