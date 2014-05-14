package lesson140331.innerlocal;

public class L {
	
	interface Changer {
		void change();
	}
	
	static {
		System.out.println("static init");
	}

	private int state;
	
	private void changeState() {
		state += 1;
	}
	
	public Changer getChanger(int amount) {
		
		final int realAmount = amount % 10;
		
		class MyChanger implements Changer {
			

			@Override
			public void change() {
				state += realAmount;
				changeState();
			}
			
		}
		
		return new MyChanger();

	}
	
	public static void main(String[] args) {
		L l = new L();
		Changer changer = l.getChanger(17);
		changer.change();
		System.out.println(l.state);
		l = new L();
	}
	
}
