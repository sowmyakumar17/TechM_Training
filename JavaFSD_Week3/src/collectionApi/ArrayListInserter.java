package collectionApi;

import java.util.ArrayList;

public class ArrayListInserter {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

		// Adding colors to the list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Inserting an element at the first position
		colors.add(0, "Purple");

		// Iterating through the color list
		System.out.println("Color list after insertion:");
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
