package hu.hazazs.psc;

import hu.hazazs.psc.exception.WeakPasswordException;

public class PasswordStrengthCalculator {

	int calculate(Validator[] validators, String password) throws WeakPasswordException {
		int strength = 0;
		for (Validator validator : validators) {
			strength += validator.validate(password);
		}
		return strength;
	}

}