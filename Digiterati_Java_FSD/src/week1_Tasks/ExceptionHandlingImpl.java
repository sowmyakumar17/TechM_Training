package week1_Tasks;

import java.util.Scanner;

public class ExceptionHandlingImpl {
	public static void main(String[] args) {
        processInput();
    }
    public static void processInput() {
        Scanner sc = new Scanner(System.in);
        //Exception Handling Implementation
        try {
            System.out.print("Enter a input value: ");
            double input = Double.parseDouble(sc.nextLine());
            if (input == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            double reciprocal = 1 / input;
            System.out.println("Reciprocal of the input value: " + reciprocal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a numerical value.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Reciprocal of the given input is found!");
            sc.close();
        }
    }
}
