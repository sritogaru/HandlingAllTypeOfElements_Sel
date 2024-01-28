package testclass;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Page.Forms;
import testBase.BaseClass;

public class FormsTest extends BaseClass {
	
	
	@Test
	public void FormsClick() throws InterruptedException {
	
		Forms form = new Forms(driver);
		form.forms();
		form.formdetails(randomString(), randomString(), randomAlphaNumeric()+"gmail.com", randomNumber(), "Eng", "Mat",randomString());
		
	}
	
	
      
	
	

}
