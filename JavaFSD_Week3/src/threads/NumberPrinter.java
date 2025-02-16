package threads;

class EvenNumberThread extends Thread {
	public void run() {
		System.out.println("Even numbers:");
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
	}
}

class OddNumberThread extends Thread {
	public void run() {
		System.out.println("Odd numbers:");
		for (int i = 1; i <= 20; i += 2) {
			System.out.println(i);
		}
	}
}

public class NumberPrinter {
	public static void main(String[] args) {
		EvenNumberThread evenThread = new EvenNumberThread();
		OddNumberThread oddThread = new OddNumberThread();

		evenThread.start();
		oddThread.start();
	}
}
