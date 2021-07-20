package hu.hazazs.psc;

import hu.hazazs.psc.exception.PasswordWithoutNumberException;
import hu.hazazs.psc.exception.WeakPasswordException;

public class NumberValidator extends AbstractValidator {

	@Override
	public int validate(String text) throws WeakPasswordException {
		super.validate(text);
		int counter = 0;
		for (char character : text.toCharArray()) {
			if (Character.isDigit(character)) {
				counter++;
			}
		}
		if (counter == 0) {
			throw new PasswordWithoutNumberException("Password doesn't contain any numbers.");
		}
		return counter;
	}

}