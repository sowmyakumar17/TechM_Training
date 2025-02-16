package task2;

import java.io.*;
import java.util.*;

class FileModificationChecker {
	public static void getLastModifiedDate(String path) {
		File file = new File(path);

		if (!file.exists()) {
			System.out.println("The specified file does not exist.");
			return;
		}

		long lastModified = file.lastModified();
		Date lastModifiedDate = new Date(lastModified);

		System.out.println("Last modified date of " + path + " is: " + lastModifiedDate);
	}
}

public class LastModifiedDateChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the file path: ");
		String path = scanner.nextLine();

		FileModificationChecker.getLastModifiedDate(path);

		scanner.close();
	}
}
