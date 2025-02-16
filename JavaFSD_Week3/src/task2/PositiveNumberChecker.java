package task2;

import java.io.*;
import java.util.*;

class PositiveNumberException extends Exception {
	private static final long serialVersionUID = 1L;

	public PositiveNumberException(String message) {
		super(message);
	}
}

class NumberFileReader {
	public static void readAndCheckNumbers(String filePath) throws FileNotFoundException, PositiveNumberException {
		File file = new File(filePath);

		if (!file.exists() || !file.isFile()) {
			throw new FileNotFoundException("File not found: " + filePath);
		}

		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNext()) {
				if (scanner.hasNextInt()) {
					int number = scanner.nextInt();
					if (number > 0) {
						throw new PositiveNumberException("Positive number found: " + number);
					}
					System.out.println("Read number: " + number);
				} else {
					scanner.next(); // Skip non-integer values
				}
			}
		}
	}
}

public class PositiveNumberChecker {
	public static void main(String[] args) {
		try {
			String filePath = "numbers.txt"; // Update with your file path
			NumberFileReader.readAndCheckNumbers(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		} catch (PositiveNumberException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}