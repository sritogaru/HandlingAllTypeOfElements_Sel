package testclass;

import org.testng.annotations.Test;

import Page.tripAdvisor;
import testBase.BaseClass;

public class Tripadvisor extends BaseClass{
	
	@Test
	public void test() {
		
		tripAdvisor ta = new tripAdvisor(driver);
		ta.searchclub("Club Mahindra");
		ta.windowhandling();
		ta.reviewwrite();
		ta.windowhandling2();
		ta.mousehover();
		
	}
	
	

}
