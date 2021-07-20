package hu.hazazs.psc.exception;

public class PasswordWithoutNumberException extends WeakPasswordException {

	private static final long serialVersionUID = 1L;

	public PasswordWithoutNumberException() {
		super();
	}

	public PasswordWithoutNumberException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PasswordWithoutNumberException(String message, Throwable cause) {
		super(message, cause);
	}

	public PasswordWithoutNumberException(String message) {
		super(message);
	}

	public PasswordWithoutNumberException(Throwable cause) {
		super(cause);
	}

}