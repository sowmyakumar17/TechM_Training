package task2;

import java.io.*;
import java.util.*;

class PathTypeChecker {
	public static void checkPathType(String path) {
		File file = new File(path);

		if (!file.exists()) {
			System.out.println("The specified path does not exist.");
			return;
		}

		if (file.isFile()) {
			System.out.println("The specified path is a file.");
		} else if (file.isDirectory()) {
			System.out.println("The specified path is a directory.");
		} else {
			System.out.println("Unknown path type.");
		}
	}
}

public class FileOrDirectoryChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the file or directory path: ");
		String path = scanner.nextLine();

		PathTypeChecker.checkPathType(path);

		scanner.close();
	}
}
