package collectionApi;

import java.util.ArrayList;

public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

		// Adding colors to the list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Iterating through the color list
		System.out.println("Iterating through the color list:");
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
