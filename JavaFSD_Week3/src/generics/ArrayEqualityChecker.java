package generics;

public class ArrayEqualityChecker {
	public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
		if (array1.length != array2.length) {
			return false;
		}

		for (int i = 0; i < array1.length; i++) {
			if (!array1[i].equals(array2[i])) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Integer[] array2 = { 1, 2, 3, 4, 5 };
		Integer[] array3 = { 1, 2, 3, 4, 6 };

		System.out.println("Array1 and Array2 are equal: " + areArraysEqual(array1, array2));
		System.out.println("Array1 and Array3 are equal: " + areArraysEqual(array1, array3));

		String[] strArray1 = { "apple", "banana", "cherry" };
		String[] strArray2 = { "apple", "banana", "cherry" };

		System.out.println("String arrays are equal: " + areArraysEqual(strArray1, strArray2));
	}
}
