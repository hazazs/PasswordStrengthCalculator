package hu.hazazs.psc;

import hu.hazazs.psc.exception.WeakPasswordException;

public interface Validator {

	int validate(String text) throws WeakPasswordException;

}