package collectionApi;

import java.util.ArrayList;

public class ArrayListRetriever {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

		// Adding colors to the list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Retrieve an element at a specified index
		int index = 2;
		if (index >= 0 && index < colors.size()) {
			System.out.println("Element at index " + index + ": " + colors.get(index));
		} else {
			System.out.println("Invalid index: " + index);
		}
	}
}
