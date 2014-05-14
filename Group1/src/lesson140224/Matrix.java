package lesson140224;

public class Matrix {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{0, 1, 2},
				{3,4,5},
				{6,7,8}
		};
		
		int[][] matrix2 = {
				{0},
				{1,2},
				{3,4,5}
		};
		
		printMatrix(matrix);
		printMatrix(matrix2);
		
		find(matrix, 4);
//		find(matrix2, 4);
		
	}

	private static void find(int[][] matrix, int item) {
		int iFound, jFound = 0;
		OUTER: for (int i = 0; i < matrix.length; i++) {
			System.out.println("before inner");
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == item) {
					iFound = i;
					jFound = j;
					System.out.println("Found!");
					break OUTER;
				}
			}
			System.out.println("after inner");
		}
		System.out.println("after outer");
		//
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
