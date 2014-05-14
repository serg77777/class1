
public class A {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("usage:  A parameter");
			System.exit(0);
		}
		if (args.length > 1) {
			System.out.println("too many parameters");
			System.exit(0);
		}
		a(args[0]);
	}
	
	static void a(String param) {
		System.out.println("param: " + param);
		
		if (param.equals("one")) {
			System.out.println("один");
		}
		
		if (param.equals("two")) {
			System.out.println("два");
		}
		
		if (param.length() <= 4) {
			System.out.println("short");
		} else {
			System.out.println("long");
		}
		
	}
	
}
