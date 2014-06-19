package lesson140618;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MatrixCalculation {

	static class Task implements Callable<Double> {
		private double[] _vector;
		public Task(double[] vector) {
			_vector = vector;
		}
		@Override
		public Double call() throws Exception {
			return calculate(_vector);
		}
		private Double calculate(double[] vector) {
			double result = 0;
			for (int i = 0; i < vector.length; i++) {
				result += calculate(vector[i]);
			}
			return result;
		}
		private double calculate(double d) {
			return Math.sin(Math.pow(d, Math.E))
					/ Math.cos(Math.pow(d, Math.E));
		}
	}
	
	public static void main(String[] args) {
		
		double[][] matrix = generate(10000, 10000);
		
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()/2);

		long start = System.nanoTime();
		
		List<Future<Double>> futures = new LinkedList<>();
		
		for (int i = 0; i < matrix.length; i++) {
			Future<Double> future = service.submit(new Task(matrix[i]));
			futures.add(future);
		}
		
		double sum = 0;
		for (Future<Double> future : futures) {
			try {
				sum += future.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("sum = " + sum);
		
//		
//		try {
//			service.awaitTermination(1, TimeUnit.HOURS);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		long stop = System.nanoTime();
		
		System.out.println("elapsed = " + (stop - start));
		
		service.shutdown();
		
	}

	public static double[][] generate(int rows, int cols) {
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
