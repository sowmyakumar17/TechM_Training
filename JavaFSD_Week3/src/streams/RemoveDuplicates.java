package streams;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input list of integers
		System.out.println("Enter integers separated by spaces:");
		List<Integer> numbers = new ArrayList<>();

		while (scanner.hasNextInt()) {
			numbers.add(scanner.nextInt());
		}

		// Remove duplicate elements using streams
		List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());

		System.out.println("List after removing duplicates: " + uniqueNumbers);

		scanner.close();
	}
}
