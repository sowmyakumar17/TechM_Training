package week1_Tasks;

import java.util.Arrays;
public class PrimitiveAndReferenceImpl {
	public static void main(String[] args) {
		int number = 10;
        int[] array = {10, 22, 35, 40, 56};
        //Before Modification
        System.out.println("Original Value of Integer Variable is " + number + " and Array is " + Arrays.toString(array));
        modifiedValues(number, array);
        //After Modification
        System.out.println("Modified Value of Integer Variable is " + number + " and Array is " + Arrays.toString(array));
    }
	//method to modify the values
	public static void modifiedValues(int number, int[] array) {
		//Modification does not change the Original value of Integer Variable 
        number = 50;
        //Modification changes the Original value of Array
        for (int i = 0; i < array.length; i++) {
            array[i] += 10; 
        }
    }

}
