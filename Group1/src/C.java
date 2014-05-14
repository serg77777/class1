public class C {

	public static void main(String[] args) {
		int[] data = { 10, 40, 20, -30, 50, 32 };
		processArray(data);

		data = new int[] { 30, 30, 20 };
		processArray(data);

		data = new int[] {};
		data = new int[0];
		processArray(data);

		processArray(null);

		data = new int[] { 10 };
		processArray(data);
	}

	private static void processArray(int[] data) {
		int max = findMax(data);
		printArray(data);
		System.out.println(max);
	}

	static void printArray(int[] data) {
		if (data == null) {
			return;
		}
		for (int element : data) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	private static int findMax(int[] data) {

		if (data == null) {
			System.out.println("no data: null array");
			return Integer.MIN_VALUE;
		}

		if (data.length <= 0) {
			System.out.println("no data: empty array");
			return Integer.MIN_VALUE;
		}

		int max = data[0];

		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;

		// if (data != null) {
		// if (data.length > 0) {
		// int max = data[0];
		//
		// for (int i = 1; i < data.length; i++) {
		// if (max < data[i]) {
		// max = data[i];
		// }
		// }
		// return max;
		// } else {
		// System.out.println("no data: empty array");
		// return Integer.MIN_VALUE;
		// }
		//
		// } else {
		// System.out.println("no data: null array");
		// return Integer.MIN_VALUE;
		// }

	}

}
