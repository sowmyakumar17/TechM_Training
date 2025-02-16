package threads;

import java.util.Arrays;

class ArraySorterThread extends Thread {
	private int[] array;

	public ArraySorterThread(int[] array) {
		this.array = array;
	}

	public void run() {
		Arrays.sort(array);
		System.out.println(Thread.currentThread().getName() + " sorted array: " + Arrays.toString(array));
	}
}

public class MultiThreadedArraySorter {
	public static void main(String[] args) {
		int[] array1 = { 5, 2, 9, 1, 6 };
		int[] array2 = { 8, 3, 7, 4, 0 };

		ArraySorterThread thread1 = new ArraySorterThread(array1);
		ArraySorterThread thread2 = new ArraySorterThread(array2);

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Both arrays sorted successfully.");
	}
}
