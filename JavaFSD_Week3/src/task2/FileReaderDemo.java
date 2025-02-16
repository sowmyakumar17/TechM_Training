package task2;

import java.io.*;

class FileReaderUtility {
	public static void readFile(String filePath) throws FileNotFoundException {
		File file = new File(filePath);

		if (!file.exists() || !file.isFile()) {
			throw new FileNotFoundException("File not found: " + filePath);
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}

public class FileReaderDemo {
	public static void main(String[] args) {
		try {
			String filePath = "sample.txt"; // Change the path to test
			FileReaderUtility.readFile(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}
