package lesson140326.inner;

public class D {

	static class Di {
		private D _d;
		Di(D d) {
			_d = d;
		}
		public void printState() {
			System.out.println(_d.state);
		}
	}
	
	int state;
	
}
