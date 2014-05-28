package lesson140528;

import java.util.Random;

public class SumOfMatrixRows {

	public static void main(String[] args) {
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		double[][] matrix = generateMatrix(10, 20000000);

		long start = System.nanoTime();
		double sum;
//		sum = sum(matrix);
		long stop = System.nanoTime();
		long elapsed = stop - start;

//		System.out.println(sum + ": " + elapsed);

		start = System.nanoTime();
		sum = sumWithThreads(matrix);
		stop = System.nanoTime();
		elapsed = stop - start;

		System.out.println(sum + ": " + elapsed);
	}

	private static double sumWithThreads(final double[][] matrix) {
		final double[] sum = new double[matrix.length];
		Thread[] threads = new Thread[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			final double row[] = matrix[i];
			final int rowIndex = i;
			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					double rowSum = 0.0;
					for (int j = 0; j < row.length; j++) {
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						rowSum += Math.sin(Math.pow(row[j], Math.E))
								/ Math.cos(Math.pow(row[j], Math.E));
					}
					sum[rowIndex] = rowSum;
				}
			});
			threads[i].start();
		}
		// wait for threads
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		double total = 0.0;
		for (int i = 0; i < sum.length; i++) {
			total += sum[i];
		}
		return total;
	}

	private static double sum(double[][] matrix) {
		double sum = 0.0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += calculate(matrix, i, j);
			}
		}
		return sum;
	}

	private static double calculate(double[][] matrix, int i, int j) {
		return Math.sin(Math.pow(matrix[i][j], Math.E))
				/ Math.cos(Math.pow(matrix[i][j], Math.E));
	}

	public static double[][] generateMatrix(int rows, int cols) {
		double[][] matrix = new double[rows][cols];

		Random random = new Random();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = random.nextDouble();
			}
		}

		return matrix;
	}

}
