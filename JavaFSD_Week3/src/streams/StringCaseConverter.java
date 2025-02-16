package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StringCaseConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input list of strings
		System.out.println("Enter strings separated by spaces:");
		List<String> strings = Arrays.asList(scanner.nextLine().split(" "));

		// Convert to uppercase using streams
		List<String> upperCaseStrings = strings.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("Uppercase strings: " + upperCaseStrings);

		// Convert to lowercase using streams
		List<String> lowerCaseStrings = strings.stream().map(String::toLowerCase).collect(Collectors.toList());

		System.out.println("Lowercase strings: " + lowerCaseStrings);

		scanner.close();
	}
}
