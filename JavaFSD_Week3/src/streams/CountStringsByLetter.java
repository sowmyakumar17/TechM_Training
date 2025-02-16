package streams;

import java.util.*;

public class CountStringsByLetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input list of strings
		System.out.println("Enter strings separated by spaces:");
		List<String> strings = Arrays.asList(scanner.nextLine().split(" "));

		// Input the target letter
		System.out.println("Enter the letter to count strings starting with it:");
		char targetLetter = scanner.next().charAt(0);

		// Count strings that start with the specific letter
		long count = strings.stream()
				.filter(s -> s.toLowerCase().startsWith(String.valueOf(targetLetter).toLowerCase())).count();

		System.out.println("Number of strings starting with '" + targetLetter + "': " + count);

		scanner.close();
	}
}
