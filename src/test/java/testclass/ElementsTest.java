package testclass;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Page.ElementsPage;
import Page.HomePage;
import testBase.BaseClass;

public class ElementsTest extends BaseClass {
	
	@Test
	public void clickonElement() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(5000);
		hp.Clickelement();
		ElementsPage ep = new ElementsPage(driver);
		//ep.textboxClick();
		//ep.Enterdetails(randomString(), randomAlphaNumeric()+"@gmail.com", randomString(), randomString());
		Thread.sleep(5000);
		//ep.CheckBoxfunctions();
		//ep.radiobtns();
		//ep.webtablelinkclick();
		//ep.EnterdetailsforWebtable(randomString(), randomString(), randomAlphaNumeric()+"@gmail.com", randomNumber(), randomNumber()+"000", randomString());
		//ep.buttonclick();
		/*ep.linksclick();
		ep.createdlink();
		String exp= "Link has responded with staus 204 and status text No Content";
		String act= ep.createdmsgverify();
		if(exp.equalsIgnoreCase(act)) {
			System.out.println(exp);
		}
		else
			System.out.println(act);
	}*/
		
	     ep.updownload();
	
	}
}
