package javaPrograms;

public class VowelsInString {

	public static void main(String[] args) {
		
		String sd = "Selenium with Java";
		
		for(int i=0; i<sd.length();i++) {
			
			if(sd.charAt(i)=='a'||sd.charAt(i)=='e'||sd.charAt(i)=='i'||sd.charAt(i)=='o'||sd.charAt(i)=='u') {
				
				System.out.println("Vowels in string are:"+sd.charAt(i));
			}else
				System.out.println("print as consonents");
		}

	}

}
