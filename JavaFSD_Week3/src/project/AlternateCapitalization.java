package project;

import java.util.*;

public class AlternateCapitalization {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input string
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		// Capitalize alternate characters
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 0) {
				result.append(Character.toUpperCase(input.charAt(i)));
			} else {
				result.append(Character.toLowerCase(input.charAt(i)));
			}
		}

		// Displaying the result
		System.out.println("Result: " + result);

		scanner.close();
	}
}
