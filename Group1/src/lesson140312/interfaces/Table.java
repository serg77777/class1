package lesson140312.interfaces;

public class Table extends Furniture {

	@Override
	public void clean() {
		System.out.println(getClass().getName() + " cleaned big table");
	}

}
