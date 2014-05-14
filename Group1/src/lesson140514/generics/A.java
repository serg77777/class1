package lesson140514.generics;

public class A {

	public static <T extends Integer> T max (T x, T y) {
		return x >y ? x : y;
	}
	
}
