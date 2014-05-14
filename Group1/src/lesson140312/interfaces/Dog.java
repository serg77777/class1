package lesson140312.interfaces;

public class Dog implements Comparable<Dog> {

	String name;
	int speed;
	int height;
	int furQuality;
	
	public Dog(String name, int speed, int height, int furQuality) {
		super();
		this.name = name;
		this.speed = speed;
		this.height = height;
		this.furQuality = furQuality;
	}

	@Override
	public int compareTo(Dog o) {

		if (this.speed > o.speed) {
			return -1;
		} 
		if (this.speed < o.speed) {
			return 1;
		}
		if (this.height > o.height) {
			return -1;
		} 
		if (this.height < o.height) {
			return 1;
		}
		if (this.furQuality > o.furQuality) {
			return -1;
		} 
		if (this.furQuality < o.furQuality) {
			return 1;
		}
		
		return 0;
	}

}
