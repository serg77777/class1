package lesson140428.variable;

public class Examples {
	
	public static void main(String[] args) {
		int i = sum (1,2);
		System.out.println(i);

		int j = sum2 (1,2, 3);
		System.out.println(j);
		
		int k = sum ();
		System.out.println(k);
		
	}

	private static int sum(int ... numbers) {
		
		System.out.println(numbers.length);
		
		int sum = 0;
		
		for (int k : numbers) {
			sum += k;
		}
		
		
		return sum;
	}

	private static int sum2(int fisrt, int ... numbers) {
		
		System.out.println(numbers.length);
		
		int sum = fisrt;
		
		for (int k : numbers) {
			sum += k;
		}
		
		
		return sum;
	}
	
	private static void wrong(int ... numbers, int j) {
		
	}
	
	private static void wrong2(int ... numbers, int ... j) {
		
	}
	

}
