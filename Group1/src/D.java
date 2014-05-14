
public class D {
	
	public static void main(String[] args) {
		int data[] = null;
		
		System.out.println(data);
		
		data = new int[50];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = i * 2 + 1;
		}
		
		C.printArray(data);
	}
}
