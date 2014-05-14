package lesson140303.internal;

import lesson140303.A;
import lesson140303.ComplexState;
import lesson140303.Counter;

public class UseAB {
	
	public static void main(String[] args) {
		
//		A.printState();
		
		A a = new A(20);
		a.printState();
		lesson140303.B b = new lesson140303.B();
		
		ComplexState cs = new ComplexState();
		
		cs.state1 = 10;
		cs.state2 = 20;
		
		Counter counter = new Counter();
		
//		counter.inc();
//		counter.count++;
//		System.out.println("changed state of counter");
//		counter.count++;
//		System.out.println("changed state of counter");
//
//		System.out.println(counter.count);
//		System.out.println("requested state of counter");
		
		counter.inc();
		counter.inc();
		counter.get();
		
		
	}

}
