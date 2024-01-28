package javaPrograms;

public class Swap2numbers {

	public static void main(String[] args) {
		
	    
	        /*int x = 100, y = 200, temp;
	 
	        System.out.println("Before Swap");
	        System.out.println("x = " + x);
	        System.out.println("y = " + y);
	 
	        // Swapping using three
	        // Variables
	        temp = x; //100
	        x = y;//200
	        y = temp;//200=//100
	 
	        System.out.println("After swap");
	        System.out.println("x = " + x);
	        System.out.println("y = " + y);*/
		
		int X= 100, Y= 200 ;
				//Swapping Logic
				X = X + Y;
				System.out.println("Before swapping:"+X);
				Y = X - Y;
				System.out.println("After swapping value of Y:"+Y);
				X = X -Y;
				System.out.println("After swapping value of X:"+X);
	    }

	}


