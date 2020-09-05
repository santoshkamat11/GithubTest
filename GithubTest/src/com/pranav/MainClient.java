package com.pranav;

public class MainClient {

	public static void main(String[] args) {
		
        Pig myPig = new Pig();  // Create a Pig object
        int x = add(9,5);
        
        System.out.println(x);
        
        int y = divide(9,5);
        
        System.out.println(y);
	
	}
	
	private static int add(int i, int z) {
		// add method
		int k = i + z;
		
		return k;
	}
	
	private static int divide(int i, int n) {
		// add method
		int k = i / n ;
		
		return k;
	}

	

}
