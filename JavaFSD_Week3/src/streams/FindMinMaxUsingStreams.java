package streams;

import java.util.*;

public class FindMinMaxUsingStreams {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input list of integers
		System.out.println("Enter integers separated by spaces:");
		List<Integer> numbers = Arrays.asList(scanner.nextLine().split(" ")).stream().map(Integer::parseInt).toList();

		// Find maximum value
		int max = numbers.stream().max(Integer::compareTo).orElseThrow(NoSuchElementException::new);

		// Find minimum value
		int min = numbers.stream().min(Integer::compareTo).orElseThrow(NoSuchElementException::new);

		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);

		scanner.close();
	}
}
