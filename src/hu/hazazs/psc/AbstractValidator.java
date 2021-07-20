package hu.hazazs.psc;

import hu.hazazs.psc.exception.MissingPasswordException;
import hu.hazazs.psc.exception.WeakPasswordException;

public abstract class AbstractValidator implements Validator {

	@Override
	public int validate(String text) throws WeakPasswordException {
		if (text == null) {
			throw new MissingPasswordException("No password is set.");
		}
		return 0;
	}

}