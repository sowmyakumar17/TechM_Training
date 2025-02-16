package collectionApi;

import java.util.LinkedList;

public class LinkedListOccurrenceFinder {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();

		// Adding elements to the linked list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");

		// Element to find
		String target = "Green";

		// Finding first and last occurrence
		int firstIndex = colors.indexOf(target);
		int lastIndex = colors.lastIndexOf(target);

		// Displaying the results
		System.out.println("Linked list: " + colors);
		System.out.println("First occurrence of '" + target + "': " + firstIndex);
		System.out.println("Last occurrence of '" + target + "': " + lastIndex);
	}
}
