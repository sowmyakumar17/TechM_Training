package collectionApi;

import java.util.LinkedList;

public class LinkedListAppender {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();

		// Adding initial colors to the linked list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");

		// Appending an element to the end
		colors.addLast("Yellow");

		// Displaying the linked list
		System.out.println("Linked list after appending: " + colors);
	}
}
