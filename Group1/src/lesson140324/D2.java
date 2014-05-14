package lesson140324;

public class D2 extends D1 {

	@Override
	public void d() {
		System.out.println("level 2");
		d1();
	}
	
	public static void main(String[] args) {
		D2 d2 = new D2();
		d2.d();
	}
}
