package hu.hazazs.psc.exception;

public class PasswordTooShortException extends WeakPasswordException {

	private static final long serialVersionUID = 1L;

	public PasswordTooShortException() {
		super();
	}

	public PasswordTooShortException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PasswordTooShortException(String message, Throwable cause) {
		super(message, cause);
	}

	public PasswordTooShortException(String message) {
		super(message);
	}

	public PasswordTooShortException(Throwable cause) {
		super(cause);
	}

}