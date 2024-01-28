package javaPrograms;

import java.util.ArrayList;

public class SumofDigitsinArray {

	public static void main(String[] args) {
		
		/*int a[] = {1,2,3,4,5};
		
		System.out.println("Sum of digits in array:" + (a[0]+a[1]+a[2]+a[3]+a[4]));*/
		
		
		ArrayList<Integer> list = new ArrayList<>(50);
		
		int sum=0;
		
		for(int i=0; i<list.size();i++) {
			
			sum = sum+list.get(i);
			
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		

	}

}
