package lesson140428.enums;

public class Examples {

	enum Apple {
		Jonathan, GoldenDel, RedDel, Winesap, Cortland
	}
	
	public static int JONATHAN = 1;
	public static int REDDEL = 2;
	
	public static void main(String[] args) {
		
		Apple ap = Apple.Jonathan;
		
		switch(ap) {
		case Jonathan:
			//
			break;
		case Winesap:
			//
			break;
		
		}
		
		
		System.out.println(JONATHAN);
		
		System.out.println(Apple.Jonathan);
		System.out.println(ap);
		
		for (Apple a : Apple.values()) {
			System.out.println(a);
		}
		
		Apple a2 = Apple.valueOf("Cortland");
		System.out.println(a2);
		
		
	}
	
	
}
