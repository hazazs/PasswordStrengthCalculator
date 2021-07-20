package hu.hazazs.psc;

import hu.hazazs.psc.exception.PasswordTooLongException;
import hu.hazazs.psc.exception.WeakPasswordException;

public class MaxLengthValidator extends AbstractValidator {

	private static int MAX_LENGTH = 30;

	@Override
	public int validate(String text) throws WeakPasswordException {
		super.validate(text);
		if (text.length() > MAX_LENGTH) {
			throw new PasswordTooLongException("The password is too long.");
		}
		return MAX_LENGTH - text.length();
	}

}