package lesson140324;

public class MyInteger extends Number {

	private int _initialValue;

	public MyInteger(int initialValue) {
		_initialValue = initialValue;
	}
	
	@Override
	public int intValue() {
		return - _initialValue;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "(" + intValue() + ")";
	}

}
