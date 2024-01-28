package javaPrograms;

public class StringReverse {

	public static void main(String[] args) {

     /*String s = "selenium";
     
     String revs = "";
     
     char ch;
     
     System.out.println("original string is"+ s);
     
     for(int i=0; i<s.length();i++) {
    	 
    	 ch = s.charAt(i);
    	 revs = ch+revs;
     }		 
    			 System.out.println("reverse string is"+ revs);
     }*/
	
	/*String input = "APITesting";
	
	StringBuilder input1 = new StringBuilder();
	 
    // append a string into StringBuilder input1
    input1.append("APITesting");

    // reverse StringBuilder input1
    input1.reverse();
    
    System.out.println(input1);*/
		
		int number = 123;
		
		int reverse=0;
		
		System.out.println("original number is:" +number);
		while(number>0) {
		int lastDigit = number % 10;
		reverse = (reverse * 10) + lastDigit;
		number = number / 10;
		System.out.println("reverse number is:"+number);
			
		}

	}

}
	
