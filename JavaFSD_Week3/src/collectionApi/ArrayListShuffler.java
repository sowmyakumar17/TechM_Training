package collectionApi;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListShuffler {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

		// Adding colors to the list
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// Shuffling the array list
		Collections.shuffle(colors);

		// Displaying the shuffled list
		System.out.println("Shuffled color list: " + colors);
	}
}
