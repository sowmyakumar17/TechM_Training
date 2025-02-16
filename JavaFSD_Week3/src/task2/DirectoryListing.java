package task2;

import java.io.*;
import java.util.*;

class DirectoryLister {
	public static void listFilesAndDirectories(String path) {
		File directory = new File(path);

		if (!directory.exists()) {
			System.out.println("Directory does not exist.");
			return;
		}

		String[] files = directory.list();

		if (files == null || files.length == 0) {
			System.out.println("Directory is empty.");
			return;
		}

		System.out.println("Files and directories in: " + path);
		for (String file : files) {
			System.out.println(file);
		}
	}
}

public class DirectoryListing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter directory path: ");
		String path = scanner.nextLine();

		DirectoryLister.listFilesAndDirectories(path);

		scanner.close();
	}
}
