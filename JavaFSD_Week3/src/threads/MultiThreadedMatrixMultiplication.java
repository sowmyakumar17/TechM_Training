package threads;

class MatrixMultiplierThread extends Thread {
	private int[][] result;
	private int[][] mat1;
	private int[][] mat2;
	private int row;

	public MatrixMultiplierThread(int[][] result, int[][] mat1, int[][] mat2, int row) {
		this.result = result;
		this.mat1 = mat1;
		this.mat2 = mat2;
		this.row = row;
	}

	public void run() {
		for (int j = 0; j < mat2[0].length; j++) {
			result[row][j] = 0;
			for (int k = 0; k < mat1[0].length; k++) {
				result[row][j] += mat1[row][k] * mat2[k][j];
			}
		}
	}
}

public class MultiThreadedMatrixMultiplication {
	public static void main(String[] args) {
		int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] mat2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int rows = mat1.length;
		int cols = mat2[0].length;
		int[][] result = new int[rows][cols];

		Thread[] threads = new Thread[rows];

		for (int i = 0; i < rows; i++) {
			threads[i] = new MatrixMultiplierThread(result, mat1, mat2, i);
			threads[i].start();
		}

		try {
			for (Thread thread : threads) {
				thread.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Resultant Matrix:");
		for (int[] row : result) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
}
