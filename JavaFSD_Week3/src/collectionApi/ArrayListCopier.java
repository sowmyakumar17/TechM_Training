package collectionApi;

import java.util.ArrayList;

public class ArrayListCopier {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

		// Adding colors to the list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Copying the array list
		ArrayList<String> copiedColors = new ArrayList<>(colors);

		// Displaying the original and copied lists
		System.out.println("Original color list: " + colors);
		System.out.println("Copied color list: " + copiedColors);
	}
}