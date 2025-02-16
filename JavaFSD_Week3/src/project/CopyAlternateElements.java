package project;

import java.util.Arrays;

public class CopyAlternateElements {
	public static void main(String[] args) {
		// Input array
		int[] originalArray = { 1, 2, 3, 4, 5, 6, 7, 8 };

		// Calculate the size of the new array
		int newSize = (originalArray.length + 1) / 2;

		// Create a new array to store alternate elements
		int[] alternateArray = new int[newSize];

		// Copy alternate elements
		int index = 0;
		for (int i = 0; i < originalArray.length; i += 2) {
			alternateArray[index++] = originalArray[i];
		}

		// Display the original array
		System.out.println("Original Array: " + Arrays.toString(originalArray));

		// Display the new array with alternate elements
		System.out.println("Alternate Array: " + Arrays.toString(alternateArray));
	}
}
