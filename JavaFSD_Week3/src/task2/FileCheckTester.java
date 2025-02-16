package task2;

import java.io.*;
import java.util.*;

class FileChecker {
	public static void checkFileOrDirectory(String path) {
		File file = new File(path);

		if (file.exists()) {
			if (file.isFile()) {
				System.out.println("The specified path is a file and it exists.");
			} else if (file.isDirectory()) {
				System.out.println("The specified path is a directory and it exists.");
			}
		} else {
			System.out.println("The specified path does not exist.");
		}
	}
}

public class FileCheckTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the file or directory path: ");
		String path = scanner.nextLine();

		FileChecker.checkFileOrDirectory(path);

		scanner.close();
	}
}
