package task2;

import java.io.*;
import java.util.*;

class PermissionChecker {
	public static void checkPermissions(String path) {
		File file = new File(path);

		if (!file.exists()) {
			System.out.println("The specified path does not exist.");
			return;
		}

		System.out.println("Checking permissions for: " + path);

		if (file.canRead()) {
			System.out.println("Read permission: Yes");
		} else {
			System.out.println("Read permission: No");
		}

		if (file.canWrite()) {
			System.out.println("Write permission: Yes");
		} else {
			System.out.println("Write permission: No");
		}
	}
}

public class FilePermissionTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the file or directory path: ");
		String path = scanner.nextLine();

		PermissionChecker.checkPermissions(path);

		scanner.close();
	}
}
