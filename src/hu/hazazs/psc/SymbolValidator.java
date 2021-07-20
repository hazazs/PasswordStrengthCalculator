package hu.hazazs.psc;

import hu.hazazs.psc.exception.PasswordWithoutSymbolException;
import hu.hazazs.psc.exception.WeakPasswordException;

public class SymbolValidator extends AbstractValidator {

	private static final char[] SYMBOLS = { '!', '%', '(', ')' };

	@Override
	public int validate(String text) throws WeakPasswordException {
		super.validate(text);
		int counter = 0;
		for (char character : text.toCharArray()) {
			if (isSymbol(character)) {
				counter++;
			}
		}
		if (counter == 0) {
			throw new PasswordWithoutSymbolException("Password doesn't contain any symbols.");
		}
		return counter;
	}

	private boolean isSymbol(char character) {
		for (char symbol : SYMBOLS) {
			if (character == symbol) {
				return true;
			}
		}
		return false;
	}

}