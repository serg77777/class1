package statics;

public class A {

	public static int objectCount;
	
	public static int getCount() {
		return objectCount;
	}
	
	int id;
	
	{
		id = objectCount++;
	}
	
}
