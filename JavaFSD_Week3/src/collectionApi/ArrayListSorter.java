package collectionApi;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorter {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

		// Adding colors to the list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Sorting the array list
		Collections.sort(colors);

		// Displaying the sorted list
		System.out.println("Sorted color list: " + colors);
	}
}
