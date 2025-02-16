package streams;

import java.util.*;

public class SumEvenOddNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input list of integers
		System.out.println("Enter integers separated by spaces:");
		List<Integer> numbers = new ArrayList<>();

		while (scanner.hasNextInt()) {
			numbers.add(scanner.nextInt());
		}

		// Calculate sum of even numbers
		int sumEven = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();

		// Calculate sum of odd numbers
		int sumOdd = numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();

		System.out.println("Sum of even numbers: " + sumEven);
		System.out.println("Sum of odd numbers: " + sumOdd);

		scanner.close();
	}
}
