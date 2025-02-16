package task2;

class OddNumberException extends Exception {
	private static final long serialVersionUID = 1L;

	public OddNumberException(String message) {
		super(message);
	}
}

class OddNumberChecker {
	public static void checkEvenNumber(int number) throws OddNumberException {
		if (number % 2 != 0) {
			throw new OddNumberException("Number is odd: " + number);
		} else {
			System.out.println("Number is even: " + number);
		}
	}
}

public class OddNumberValidator {
	public static void main(String[] args) {
		try {
			int number = 15; // Change this to test different values
			OddNumberChecker.checkEvenNumber(number);
		} catch (OddNumberException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}
