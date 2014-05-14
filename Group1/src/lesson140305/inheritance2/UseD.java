package lesson140305.inheritance2;

public class UseD {

	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.getState());
		d.doIt();
//		d.changeState();  ERROR: only for descendants!
		System.out.println(d.getState());
	}

}
