package generics;

import java.util.ArrayList;
import java.util.List;

public class ListMerger {
	public static <T> List<T> mergeListsAlternately(List<T> list1, List<T> list2) {
		List<T> mergedList = new ArrayList<>();
		int maxLength = Math.max(list1.size(), list2.size());

		for (int i = 0; i < maxLength; i++) {
			if (i < list1.size()) {
				mergedList.add(list1.get(i));
			}
			if (i < list2.size()) {
				mergedList.add(list2.get(i));
			}
		}

		return mergedList;
	}

	public static void main(String[] args) {
		List<String> list1 = List.of("apple", "banana", "cherry");
		List<String> list2 = List.of("date", "elderberry", "fig", "grape");

		System.out.println("List 1: " + list1);
		System.out.println("List 2: " + list2);
		System.out.println("Merged List: " + mergeListsAlternately(list1, list2));

		List<Integer> numbers1 = List.of(1, 3, 5);
		List<Integer> numbers2 = List.of(2, 4, 6, 8, 10);

		System.out.println("Numbers 1: " + numbers1);
		System.out.println("Numbers 2: " + numbers2);
		System.out.println("Merged Numbers: " + mergeListsAlternately(numbers1, numbers2));
	}
}
