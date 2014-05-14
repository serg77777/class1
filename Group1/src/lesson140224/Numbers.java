package lesson140224;

public class Numbers {

	public static void main(String[] args) {
		
		byte b = -128;    // 8 bit  1 byte
		b = 127;
//		b = 128;  ERROR  
		
		char c = 65;     // 16 bit 2 bytes
		System.out.println(c);
		
		short s = 16900;   //  16 bit    2 bytes
		s = -1300;
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		int i = Integer.MAX_VALUE;  // 32 bit  4 byte
		i = i + 1;
		System.out.println(i);
		
		long l = Long.MAX_VALUE;   // 62 bit   8 byte
		
		float f = 0.0f;   // 32 bit
		double d = 0.0;   //  64 bit 
		
		d = 0.1e10;
		
		System.out.println(d);
		
		boolean bool = true;
		System.out.println(bool == false);
		
		
	}
	
}
