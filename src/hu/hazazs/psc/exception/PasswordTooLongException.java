package hu.hazazs.psc.exception;

public class PasswordTooLongException extends WeakPasswordException {

	private static final long serialVersionUID = 1L;

	public PasswordTooLongException() {
		super();
	}

	public PasswordTooLongException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PasswordTooLongException(String message, Throwable cause) {
		super(message, cause);
	}

	public PasswordTooLongException(String message) {
		super(message);
	}

	public PasswordTooLongException(Throwable cause) {
		super(cause);
	}

}