package hu.hazazs.psc.exception;

public class PasswordWithoutUpperCaseLetterException extends WeakPasswordException {

	private static final long serialVersionUID = 1L;

	public PasswordWithoutUpperCaseLetterException() {
		super();
	}

	public PasswordWithoutUpperCaseLetterException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PasswordWithoutUpperCaseLetterException(String message, Throwable cause) {
		super(message, cause);
	}

	public PasswordWithoutUpperCaseLetterException(String message) {
		super(message);
	}

	public PasswordWithoutUpperCaseLetterException(Throwable cause) {
		super(cause);
	}

}