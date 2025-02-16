package streams;

import java.util.*;

public class AverageCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input list of integers
		System.out.println("Enter integers separated by spaces:");
		List<Integer> numbers = new ArrayList<>();

		while (scanner.hasNextInt()) {
			numbers.add(scanner.nextInt());
		}

		// Calculate average using streams
		double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);

		System.out.println("Average of the numbers: " + average);

		scanner.close();
	}
}
