package collectionApi;

import java.util.LinkedList;

public class LinkedListElementInserter {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();

		// Adding initial colors to the linked list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Inserting an element at a specified position
		int position = 2;
		String newColor = "Purple";
		colors.add(position, newColor);

		// Displaying the linked list
		System.out.println("Linked list after insertion:");
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
