package lesson140604;

public class WaitNotSynched {

	public static void main(String[] args) {
		
		Object mutex = new Object(); // monitor
		
		try {
			mutex.wait(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
