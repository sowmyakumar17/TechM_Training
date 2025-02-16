package collectionApi;

import java.util.LinkedList;

public class LinkedListIterator {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();

		// Adding initial colors to the linked list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Iterating through the linked list
		System.out.println("Elements in the linked list:");
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
