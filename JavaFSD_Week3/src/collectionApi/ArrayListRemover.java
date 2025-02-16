package collectionApi;

import java.util.ArrayList;

public class ArrayListRemover {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

		// Adding colors to the list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Remove the third element (index 2)
		int indexToRemove = 2;

		if (indexToRemove >= 0 && indexToRemove < colors.size()) {
			colors.remove(indexToRemove);
			System.out.println("List after removal: " + colors);
		} else {
			System.out.println("Invalid index: " + indexToRemove);
		}
	}
}
