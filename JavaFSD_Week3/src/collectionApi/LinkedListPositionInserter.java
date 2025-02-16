package collectionApi;

import java.util.LinkedList;

public class LinkedListPositionInserter {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();

		// Adding initial colors to the linked list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Inserting elements at the first and last positions
		colors.addFirst("Purple");
		colors.addLast("Orange");

		// Displaying the linked list
		System.out.println("Linked list after insertion:");
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
