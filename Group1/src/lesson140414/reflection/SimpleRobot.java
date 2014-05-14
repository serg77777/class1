package lesson140414.reflection;

public class SimpleRobot implements Robot {

	@Override
	public void forward() {
		System.out.println("forward");
	}

	@Override
	public void back() {
		System.out.println("back");
	}

	@Override
	public void stop() {
		System.out.println("stop");
	}

	@Override
	public void left() {
		System.out.println("left");
	}

	@Override
	public void right() {
		System.out.println("right");
	}
	
	public void ququ() {
		System.out.println("qq");
	}
	

}
