package hu.hazazs.psc;

import java.util.Scanner;

public class UserInputManager {

	private final Scanner scanner;

	public UserInputManager(Scanner scanner) {
		this.scanner = scanner;
	}

	String readString(String message) {
		System.out.print(message);
		return scanner.nextLine();
	}

}