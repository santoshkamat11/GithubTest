package com.pranav;

public class MainClient {

	public static void main(String[] args) {
		
        Pig myPig = new Pig();  // Create a Pig object
        int x = subtract(9,4);
        
        System.out.println(x);
        
        int y = divide(9,4);
        
        System.out.println(y);
	
	}
	
	private static int subtract(int i, int j) {
		// add method
		int k = i - j;
		
		return k;
	}
	
	private static int divide(int i, int j) {
		// add method
		int k = i / j;
		
		return k;
	}

	

}
