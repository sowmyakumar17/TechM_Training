package collectionApi;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListReverseIterator {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();

		// Adding initial colors to the linked list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");

		// Iterate the linked list in reverse order
		System.out.println("Elements in reverse order:");
		ListIterator<String> iterator = colors.listIterator(colors.size());
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
}
