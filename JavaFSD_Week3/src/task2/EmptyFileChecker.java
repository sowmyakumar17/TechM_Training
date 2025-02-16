package task2;

import java.io.*;
import java.util.*;

class EmptyFileException extends Exception {
	private static final long serialVersionUID = 1L;

	public EmptyFileException(String message) {
		super(message);
	}
}

class EmptyFileReader {
	public static void readFile(String filePath) throws FileNotFoundException, EmptyFileException {
		File file = new File(filePath);

		if (!file.exists() || !file.isFile()) {
			throw new FileNotFoundException("File not found: " + filePath);
		}

		try (Scanner scanner = new Scanner(file)) {
			if (!scanner.hasNext()) {
				throw new EmptyFileException("File is empty: " + filePath);
			}

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}
	}
}

public class EmptyFileChecker {
	public static void main(String[] args) {
		try {
			String filePath = "sample.txt"; // Update with your file path
			EmptyFileReader.readFile(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		} catch (EmptyFileException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}
