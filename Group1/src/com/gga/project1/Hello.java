package com.gga.project1;

public class Hello {
	
	// inner classes
	
	// fields
	
	// methods
	
	/* sdfsdfsdf sdfsdf */ 
	
	
	/*
	 * 
	 * 
	 * 
	 */
	
	
	// Entry point
	public static void main(String[] p) {
		System.out.println("Hello, world!");
		for (int i = 0; i < p.length; i++) {
			System.out.println("Arg " + i + " = " + p[i]);
		}
		
		int i = 0;
		while (i < p.length) {
			System.out.println("Arg " + i + " = " + p[i]);
			i = i + 1;
//			i += 1;
//			i++;
		}
		
		for (String parameter : p) 
			System.out.println("Arg  = " + parameter);
		
		
		i = 0;
		do {
			System.out.println("Arg " + i + " = " + p[i++]);
		} while (i < p.length);
		
		
	}

}
