package task2;

import java.io.*;
import java.util.*;

class FileFilterByExtension {
	public static void listFilesWithExtension(String path, String extension) {
		File directory = new File(path);

		if (!directory.exists() || !directory.isDirectory()) {
			System.out.println("Invalid directory path.");
			return;
		}

		// Filter files with the specified extension
		File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(extension.toLowerCase()));

		if (files == null || files.length == 0) {
			System.out.println("No files with extension '" + extension + "' found.");
			return;
		}

		System.out.println("Files with extension '" + extension + "' in: " + path);
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}

public class FileExtensionLister {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter directory path: ");
		String path = scanner.nextLine();

		System.out.print("Enter file extension (e.g., .txt, .java): ");
		String extension = scanner.nextLine();

		FileFilterByExtension.listFilesWithExtension(path, extension);

		scanner.close();
	}
}
