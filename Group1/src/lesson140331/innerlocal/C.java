package lesson140331.innerlocal;

public class C {

	static class StaticInner 
	  implements I {
		@Override
		public void doIt() {
			System.out.println(
			"I did it, "
			+ "but from inside");
		}
	}

	public I getImplementorOfI() {
		return new StaticInner();
	}

}
