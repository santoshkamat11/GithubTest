package com.pranav;

public class MainClient {

	public static void main(String[] args) {
		
        Pig myPig = new Pig();  // Create a Pig object
		
        int x = add(9,4);
        System.out.println(x);
        
        int y = subtract(9,4);
		System.out.println(y);
		
		
		
	}

	
		
	private static int add(int i, int j) {
		// add method
		int k = i + j;
		
		return k;
	}

	private static int subtract(int i, int j) {
		// add method
		int k = i - j;
		
		return k;
	}

}
