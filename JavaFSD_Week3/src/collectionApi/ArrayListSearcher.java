package collectionApi;

import java.util.ArrayList;

public class ArrayListSearcher {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

		// Adding colors to the list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Search for an element
		String searchColor = "Blue";

		if (colors.contains(searchColor)) {
			System.out.println(searchColor + " is found at index: " + colors.indexOf(searchColor));
		} else {
			System.out.println(searchColor + " is not found in the list.");
		}
	}
}
