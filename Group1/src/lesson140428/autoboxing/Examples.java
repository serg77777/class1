package lesson140428.autoboxing;

import java.util.Hashtable;

public class Examples {
	
	public static void main(String[] args) {
		
		int a = 0;
		Integer i = new Integer(10);
		
		a = i.intValue();
		
		long l;
		
		l = i.longValue();
		
		Hashtable t = new Hashtable();
		
		t.put("John", "341-15-76");
		t.put("Stranger", "2-12-85-06");
		
		
		System.out.println(t.get("John"));
		
		t.put(new Integer(143567), "Smith");
		t.put(new Integer(345324), "Smith");
		
		a = i;  // auto-unboxing
		
		t.put(345234, "Cumberbatch");  // auto-boxing
		
		l = i;  // auto-unboxing
		
		Integer i1 = 153453453;
		Integer i2 = 153453453;
		System.out.println(i1.equals(i2));
		
		i1 = new Integer (42);
		i2 = new Integer (42);
		System.out.println(i1.equals(i2));

		i1 = 42;
		i2 = 42;
		System.out.println(i1.equals(i2));
		
		
	}
	
	static int getIntValue(Integer iv) {
		return iv;
	}
	

}
