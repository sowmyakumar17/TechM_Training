package week1_Tasks;

public class FinalClassImpl {
	 public static void main(String[] args) {
	        FinalClass object = new FinalClass();
	        System.out.println("Constant Value is: " + object.getFinalConstantValue());
	        object.displayMessage();
	  }
}
// Final class cannot be extended and Final variable must be initialized and cannot be changed
final class FinalClass {
	private final int finalconstantValue = 50;
    public int getFinalConstantValue() {
    	return finalconstantValue;
	}
	// Final method cannot be overridden
	public final void displayMessage() {
	    System.out.println("A final method is implemented inside a final class.");
	}
}

	



