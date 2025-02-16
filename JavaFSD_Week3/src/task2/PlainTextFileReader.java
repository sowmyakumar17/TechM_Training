package task2;

import java.io.*;

class PlainTextFileReader {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the plain text file path: ");
			String filePath = reader.readLine();

			File file = new File(filePath);

			if (!file.exists() || !file.isFile()) {
				System.out.println("File does not exist or is not a valid file.");
				return;
			}

			try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
				String line;
				System.out.println("File content:");
				while ((line = fileReader.readLine()) != null) {
					System.out.println(line);
				}
			}

		} catch (IOException e) {
			System.out.println("Error reading input: " + e.getMessage());
		}
	}
}