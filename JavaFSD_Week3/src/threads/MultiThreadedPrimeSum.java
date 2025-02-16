package threads;

class PrimeSumThread extends Thread {
	private int start;
	private int end;
	private long sum = 0;

	public PrimeSumThread(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public long getSum() {
		return sum;
	}

	private boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public void run() {
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
	}
}

public class MultiThreadedPrimeSum {
	public static void main(String[] args) {
		int limit = 100000;
		int numThreads = 4;
		PrimeSumThread[] threads = new PrimeSumThread[numThreads];

		int range = limit / numThreads;
		for (int i = 0; i < numThreads; i++) {
			int start = i * range + 1;
			int end = (i == numThreads - 1) ? limit : (i + 1) * range;
			threads[i] = new PrimeSumThread(start, end);
			threads[i].start();
		}

		long totalSum = 0;
		try {
			for (PrimeSumThread thread : threads) {
				thread.join();
				totalSum += thread.getSum();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Sum of prime numbers up to " + limit + ": " + totalSum);
	}
}
