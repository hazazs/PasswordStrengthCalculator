package hu.hazazs.psc.exception;

public class PasswordWithoutSymbolException extends WeakPasswordException {

	private static final long serialVersionUID = 1L;

	public PasswordWithoutSymbolException() {
		super();
	}

	public PasswordWithoutSymbolException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PasswordWithoutSymbolException(String message, Throwable cause) {
		super(message, cause);
	}

	public PasswordWithoutSymbolException(String message) {
		super(message);
	}

	public PasswordWithoutSymbolException(Throwable cause) {
		super(cause);
	}

}