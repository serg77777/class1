package lesson140331.innerlocal;

public class E {
	int state = 30;
	public I getImplementorOfI() {
		class LocalImplementor implements I {
			@Override
			public void doIt() {
				System.out.println("I did it locally, state = " + state);
			}
		}
		return new LocalImplementor();
	}
}
