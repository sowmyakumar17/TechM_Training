package streams;

import java.util.*;
import java.util.stream.Collectors;

public class SortStringsAlphabetically {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input list of strings
		System.out.println("Enter strings separated by spaces:");
		List<String> strings = Arrays.asList(scanner.nextLine().split(" "));

		// Sort in ascending order
		List<String> ascendingOrder = strings.stream().sorted().collect(Collectors.toList());
		System.out.println("Strings in ascending order: " + ascendingOrder);

		// Sort in descending order
		List<String> descendingOrder = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Strings in descending order: " + descendingOrder);

		scanner.close();
	}
}
