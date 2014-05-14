package lesson140324;

public class A {

	int state;
	
	public int getState() {
		return state;
	}
	
	// OVERRIDE  - переопределение
	
	// OVERLOAD  - перегрузка
	
	// signature 
	
	//  a(int)  a(int, int)
	
	public void changeState() {
		state += 10;
	}
	
	public void changeState(int change) {
		state += change;
	}
	
	public void changeState(boolean change) {
		if (change) {
			state += 100;
		}
	}
	
	public void changeState(boolean change, int amount) {
		if (change) {
			state += amount;
		}
	}
	
	public void changeState(int amount, boolean change) {
		if (change) {
			state += amount;
		}
	}
	
}
