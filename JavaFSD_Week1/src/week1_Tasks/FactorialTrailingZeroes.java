package week1_Tasks;

import java.util.Scanner;

public class FactorialTrailingZeroes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a input value: ");
		int input=sc.nextInt();
		sc.close();
		int trial=noOfTrailingZeroes(input);
		System.out.print("Number of trailing zeroes in " + input + " is " + trial);
	}
	public static int noOfTrailingZeroes(int input) {
		int trial=0;
		for(int i=5;i<=input;i*=5){
			trial+=input/i;
		}
		return trial;
    }
}
