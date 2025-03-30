package utility;

public class IntegerLengthUtility {
	// Utility method to find the length of an integer
    public static int getLengthOfInteger(int input) {
        int length = 0;
        input = Math.abs(input);
        do {
            length++;
            input /= 10;
        } while (input > 0);
        return length;
    }
}
