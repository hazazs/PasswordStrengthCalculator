package hu.hazazs.psc;

import java.util.Scanner;

import hu.hazazs.psc.exception.WeakPasswordException;

public class App {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			new App().run(scanner);
		}
	}

	private void run(Scanner scanner) {
		UserInputManager userInputManager = new UserInputManager(scanner);
		String password = userInputManager.readString("Please set a password! ");
		Validator[] validators = { new MinLengthValidator(), new MaxLengthValidator(), new LowerCaseLetterValidator(),
				new UpperCaseLetterValidator(), new NumberValidator(), new SymbolValidator() };
		try {
			System.out.println("The password is strong, strength = "
					+ new PasswordStrengthCalculator().calculate(validators, password));
		} catch (WeakPasswordException exception) {
			System.out.println(exception.getMessage());
		}
	}

}