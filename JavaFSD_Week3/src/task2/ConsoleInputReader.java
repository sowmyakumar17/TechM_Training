package task2;

import java.io.*;

class ConsoleInputReader {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter your name: ");
			String name = reader.readLine();

			System.out.print("Enter your age: ");
			int age = Integer.parseInt(reader.readLine());

			System.out.println("Hello, " + name + "! You are " + age + " years old.");

		} catch (IOException e) {
			System.out.println("Error reading input: " + e.getMessage());
		}
	}
}
