package generics;

import java.util.List;

public class NumberSumCalculator {
	public static <T extends Number> void calculateEvenOddSum(List<T> numbers) {
		double evenSum = 0;
		double oddSum = 0;

		for (T num : numbers) {
			if (num.doubleValue() % 2 == 0) {
				evenSum += num.doubleValue();
			} else {
				oddSum += num.doubleValue();
			}
		}

		System.out.println("Sum of even numbers: " + evenSum);
		System.out.println("Sum of odd numbers: " + oddSum);
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		calculateEvenOddSum(numbers);
	}
}
