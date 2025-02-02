package week1_Tasks;

public class StringProcessor {
	 // Method to count number of occurrences of a substring
    public static int noOfOccurrences(String text, String sub) {
        return text.split(sub, -1).length - 1;
    }
    // Method to reverse a string
    public static String stringReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    // Method to capitalize and split
    public static String capitalizeAndSplit(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
            }
        }
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        String string = "Java is a Programming Language";
        System.out.println("Number of Occurrences of 'Java' is: " + noOfOccurrences(string, "Java"));
        System.out.println("Reversed string is: " + stringReverse(string));
        System.out.println("Capitalized string is: " + capitalizeAndSplit(string));
    }
}
