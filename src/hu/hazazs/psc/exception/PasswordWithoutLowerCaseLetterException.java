package hu.hazazs.psc.exception;

public class PasswordWithoutLowerCaseLetterException extends WeakPasswordException {

	private static final long serialVersionUID = 1L;

	public PasswordWithoutLowerCaseLetterException() {
		super();
	}

	public PasswordWithoutLowerCaseLetterException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PasswordWithoutLowerCaseLetterException(String message, Throwable cause) {
		super(message, cause);
	}

	public PasswordWithoutLowerCaseLetterException(String message) {
		super(message);
	}

	public PasswordWithoutLowerCaseLetterException(Throwable cause) {
		super(cause);
	}

}