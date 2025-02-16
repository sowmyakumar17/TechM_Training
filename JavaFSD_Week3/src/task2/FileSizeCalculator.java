package task2;

import java.io.*;

class FileSizeCalculator {
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

			long fileSizeInBytes = file.length();
			double fileSizeInKB = fileSizeInBytes / 1024.0;
			double fileSizeInMB = fileSizeInKB / 1024.0;

			System.out.println("File size in bytes: " + fileSizeInBytes);
			System.out.println("File size in KB: " + String.format("%.2f", fileSizeInKB));
			System.out.println("File size in MB: " + String.format("%.2f", fileSizeInMB));

		} catch (IOException e) {
			System.out.println("Error reading input: " + e.getMessage());
		}
	}
}
