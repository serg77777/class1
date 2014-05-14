package lesson140331.innerlocal;

public class F {
	int state = 50;
	public I getImplementorOfI() {
		return new I() {
			@Override
			public void doIt() {
				System.out.println("I did it anonymously, state = " + state);
			}
		};
	}

}
