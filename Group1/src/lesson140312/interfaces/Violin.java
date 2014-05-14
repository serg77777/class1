package lesson140312.interfaces;

public class Violin extends StringInstrument {

	@Override
	public void play() {
		System.out.println(getClass().getName() + " plays sadly");
	}

	@Override
	public void crush() {
		System.out.println(getClass().getName() + " crashed with cry");
	}

	@Override
	public void clean() {
		System.out.println(getClass().getName() + " cleaned");
	}
	
	public void piccicato() {
		System.out.println("piccicato");
	}

}
