package lesson140303;

public class ComplexState {
	
	public int state1;
	public int state2;
	
	public void setState(int state) {
		state1 = state;
		state2 = state >> 1;
	}
	
	public boolean setState2 (int state) {
		if (state > state1) {
			return false;
		} else {
			state2 = state;
			return true;
		}
	}

}
