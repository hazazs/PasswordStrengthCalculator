package hu.hazazs.psc;

import hu.hazazs.psc.exception.PasswordWithoutUpperCaseLetterException;
import hu.hazazs.psc.exception.WeakPasswordException;

public class UpperCaseLetterValidator extends AbstractValidator {

	@Override
	public int validate(String text) throws WeakPasswordException {
		super.validate(text);
		int counter = 0;
		for (char character : text.toCharArray()) {
			if (Character.isUpperCase(character)) {
				counter++;
			}
		}
		if (counter == 0) {
			throw new PasswordWithoutUpperCaseLetterException("Password doesn't contain any uppercase letters.");
		}
		return counter;
	}

}