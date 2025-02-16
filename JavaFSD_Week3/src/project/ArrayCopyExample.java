package project;

import java.util.*;

public class ArrayCopyExample {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {10, 20, 30, 40, 50, 60, 70, 80};

        // Copying a range of elements (from index 2 to 5, end index is exclusive)
        int[] copiedArray = Arrays.copyOfRange(originalArray, 2, 6);

        // Displaying the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Displaying the copied array
        System.out.println("Copied Range (Index 2 to 5): " + Arrays.toString(copiedArray));
    }
}
