package lesson140630.atomics;

public class CasCounter {

	private SimulatedCAS cas;
	
	public int getValue() {
		return cas.get();
	}
	
	public int inc() {
		int v;
		
		do {
			v = cas.get();
		} while (v != cas.compareAndSwap(v,  v+1));
	
		return v + 1;
		
	}
}
