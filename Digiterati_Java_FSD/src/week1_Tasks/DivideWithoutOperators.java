package week1_Tasks;

public class DivideWithoutOperators {
	 public static void main(String[] args) {
		 int dividendValue = 23;
	     int divisorValue = 2;
         int quotientValue = 0;
	     int remainderValue = dividendValue;
	     while (remainderValue >= divisorValue) {
	    	 remainderValue -= divisorValue;
	         quotientValue++;
	     }
	     System.out.println("Quotient: " + quotientValue);
	     System.out.println("Remainder: " + remainderValue);
	 }
}
