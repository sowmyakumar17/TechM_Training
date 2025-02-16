package generics;

import java.util.ArrayList;
import java.util.List;

public class ListReverser {
	public static <T> List<T> reverseList(List<T> list) {
		List<T> reversedList = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}
		return reversedList;
	}

	public static void main(String[] args) {
		List<String> words = List.of("apple", "banana", "cherry", "date");
		System.out.println("Original list: " + words);
		System.out.println("Reversed list: " + reverseList(words));

		List<Integer> numbers = List.of(10, 20, 30, 40, 50);
		System.out.println("Original list: " + numbers);
		System.out.println("Reversed list: " + reverseList(numbers));
	}
}
