package hu.hazazs.psc;

import hu.hazazs.psc.exception.PasswordTooShortException;
import hu.hazazs.psc.exception.WeakPasswordException;

public class MinLengthValidator extends AbstractValidator {

	private static final int MIN_LENGTH = 8;

	@Override
	public int validate(String text) throws WeakPasswordException {
		super.validate(text);
		if (text.length() < MIN_LENGTH) {
			throw new PasswordTooShortException("The password is too short.");
		}
		return text.length() - MIN_LENGTH;
	}

}