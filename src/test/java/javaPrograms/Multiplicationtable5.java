package javaPrograms;

import java.util.Scanner;

public class Multiplicationtable5 {

	public static void main(String[] args) {
		
		/*int x=5;
		
		for(int i=0;i<=10;i++) {
			
				System.out.println(x+" * "+i+" = "+x*i);
					
			}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(num+" * "+i+" = "+num*i);
		}

	}
}


