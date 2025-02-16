package generics;

import java.util.List;

public class ElementFinder {
	public static <T> int findFirstOccurrence(List<T> list, T target) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		List<String> words = List.of("apple", "banana", "cherry", "date", "apple");
		System.out.println("Index of 'apple': " + findFirstOccurrence(words, "apple"));
		System.out.println("Index of 'mango': " + findFirstOccurrence(words, "mango"));

		List<Integer> numbers = List.of(10, 20, 30, 40, 50);
		System.out.println("Index of 30: " + findFirstOccurrence(numbers, 30));
		System.out.println("Index of 100: " + findFirstOccurrence(numbers, 100));
	}
}
