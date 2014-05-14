package com.gga.project1;

public class Parameters {

	public static void main(String[] args) {
		
		int i = 10;
		
		process(i);   //  10 <== i
		
		System.out.println(i);
		
	}

	private static void process(final int localI) {
		// localI = 10;
//		localI = localI * 2;
		System.out.println(localI);
	}
	
}
