package task2;

import java.io.*;

class FileToByteArray {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the file path: ");
			String filePath = reader.readLine();

			File file = new File(filePath);

			if (!file.exists() || !file.isFile()) {
				System.out.println("File does not exist or is not a valid file.");
				return;
			}

			byte[] fileContent = new byte[(int) file.length()];

			try (FileInputStream fis = new FileInputStream(file)) {
				fis.read(fileContent);
			}

			System.out.println("File content in bytes:");
			for (byte b : fileContent) {
				System.out.print(b + " ");
			}

		} catch (IOException e) {
			System.out.println("Error reading input: " + e.getMessage());
		}
	}
}
