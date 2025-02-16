package collectionApi;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPositionIterator {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();

		// Adding initial colors to the linked list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");

		// Starting position for iteration
		int startPosition = 2;

		// Iterate from the specified position
		System.out.println("Elements from position " + startPosition + ":");
		if (startPosition >= 0 && startPosition < colors.size()) {
			ListIterator<String> iterator = colors.listIterator(startPosition);
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		} else {
			System.out.println("Invalid starting position.");
		}
	}
}
