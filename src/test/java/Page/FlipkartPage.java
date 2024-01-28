package Page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartPage extends BasePage {
	
	public FlipkartPage(WebDriver driver) {
		
		super(driver);
	}
	@FindBy(xpath="//input[@class='Pke_EE' and @type='text']")
	WebElement searchclick;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchbtn;
	
	@FindBy(xpath="//div[@class='_3pLy-c row'][1]//div[contains(text(),'APPLE iPhone 14 Plus (Yellow, 256 GB)')]")
	WebElement clickonphone;
	
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d' and text()='₹76,999']")
	WebElement selectprice;
	
	public void search(String input) {
		searchclick.click();
		searchclick.sendKeys(input);
		searchbtn.click();	
		clickonphone.click();
	}
	
	
	public String getwindow3() {
		Set<String> allwindows = driver.getWindowHandles();
		Object[] windows= allwindows.toArray();
		String window1 = windows[0].toString();
		  String window2 = windows[1].toString();
		  String window3 = windows[2].toString();
		  String window4 = windows[3].toString();
		  driver.switchTo().window(window4);
		  return window3;
		  
	}
	    public String getpricefpk() {
	 
		String sd = selectprice.getAttribute("innerHTML");
		System.out.println(sd);
		return sd;
		
		
	}
	

}
