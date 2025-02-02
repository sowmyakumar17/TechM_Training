package utility;

import java.util.Scanner;
public class UtilityImpl {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        sc.close();
        System.out.println("Length of the number " + input + " is " + utility.IntegerLengthUtility.getLengthOfInteger(input));
    }
}
