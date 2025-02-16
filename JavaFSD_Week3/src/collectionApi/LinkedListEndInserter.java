package collectionApi;

import java.util.LinkedList;

public class LinkedListEndInserter {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();

		// Adding initial colors to the linked list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");

		// Inserting an element at the end
		colors.addLast("Purple");

		// Displaying the linked list
		System.out.println("Linked list after inserting at the end:");
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
