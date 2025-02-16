package collectionApi;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMultiInserter {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();

		// Adding initial colors to the linked list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");

		// Elements to insert
		List<String> newColors = List.of("Yellow", "Purple");

		// Inserting elements at a specified position
		int position = 2;
		colors.addAll(position, newColors);

		// Displaying the linked list
		System.out.println("Linked list after insertion:");
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
