package collectionApi;

import java.util.ArrayList;

public class ArrayListUpdater {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

		// Adding colors to the list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Update an element at a specified index
		int index = 2;
		String newColor = "Purple";

		if (index >= 0 && index < colors.size()) {
			colors.set(index, newColor);
			System.out.println("Updated list: " + colors);
		} else {
			System.out.println("Invalid index: " + index);
		}
	}
}
