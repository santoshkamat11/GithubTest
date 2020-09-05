package com.pranav;

public class MainClient {

	public static void main(String[] args) {
		
		Pig myPig = new Pig();  // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep(); 
		
		for(int i = 0 ; i<= 5 ; i++) {
	    	System.out.println(i);
	    }

	}

}
