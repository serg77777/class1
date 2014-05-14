package lesson140414.reflection;

public class Robot2D implements Robot {

	int _x;
	int _y;
	final static int VX = 10;
	final static int VY = 10;
	
	public Robot2D(int x, int y) {
		_x = x;
		_y = y;
	}
	
	@Override
	public void forward() {
		_y -= VY;
	}

	@Override
	public void back() {
		_y += VY;
	}

	@Override
	public void stop() {
	}

	@Override
	public void left() {
		_x -= VX;
	}

	@Override
	public void right() {
		_x += VX;
	}
	
	
}
