package lesson140224;

public class Operations {

	public static void main(String[] args) {
		
		int a = 10 + 20 * 30 / 40 - 50;
		int b = a % 2;
		int c = b >> 4;
		int d = b << 2;
		int e = d & 0xff;
		int f = d | 0xFF;
		int g = d ^ 0xFF;  // XOR
		boolean h = a < 10  && b > 20;
		boolean i = a == 0 || d != c;
		
		String s = null;
		
		if (s != null && s.equals("hello")) {
			//
		}
		System.out.println("hello");
		
	}
	
}
