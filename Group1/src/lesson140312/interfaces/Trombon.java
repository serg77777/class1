package lesson140312.interfaces;

public class Trombon extends WindInstrument {

	@Override
	public void play() {
		System.out.println(this.getClass().getSimpleName() + " plays:  phuuuuu");
	}

	@Override
	public void crush() {
		System.out.println(getClass().getName() + " crushed");
	}

	@Override
	public void clean() {
		System.out.println(getClass().getName() + " cleaned");
	}

}
