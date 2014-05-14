package lesson140224;

public class Blocks {

	public static int bigI = 10;

	int x;
	
	public static void main(String[] args) {
		
		int a = 30;   // scope
		System.out.println(a);
		
		{
			int j = 20;
			System.out.println(bigI);
			System.out.println(a);
		}
		
//		System.out.println(j);   ERROR!
		
		if (bigI < 10) {
			
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
//		System.out.println(i);
		
		
		
	}
	
}
