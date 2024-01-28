package javaPrograms;

public class NumofDigitsinNumber {
	
	public static void main(String[] args) {
		
		int count =0;
		int num=45678;
		
		while(num!=0) {
			num/=10; //45678/10= 4567.8, 4567/10 = 456.7, 456/10=45.6, 45/10=4.5, 4/10=0.4
			count++; //1,2,3,4,5
		}
		
		System.out.println("Number of Digits:" +count);
	}

}
