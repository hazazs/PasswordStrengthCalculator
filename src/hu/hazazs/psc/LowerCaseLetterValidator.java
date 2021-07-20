package hu.hazazs.psc;

import hu.hazazs.psc.exception.PasswordWithoutLowerCaseLetterException;
import hu.hazazs.psc.exception.WeakPasswordException;

public class LowerCaseLetterValidator extends AbstractValidator {

	@Override
	public int validate(String text) throws WeakPasswordException {
		super.validate(text);
		int counter = 0;
		for (char character : text.toCharArray()) {
			if (Character.isLowerCase(character)) {
				counter++;
			}
		}
		if (counter == 0) {
			throw new PasswordWithoutLowerCaseLetterException("Password doesn't contain any lowercase letters.");
		}
		return counter;
	}

}