package com.gga.project1;

public class Divider {

	public static void main(String[] args) {
		int result = div(100, 0);
		System.out.println("Result = " + result);
	}

	private static int div(int i, int j) {
		if (j == 0) {
			System.out.println("wrong number");
			return Integer.MAX_VALUE;
		}
		return i / j;
	}

}
