package Page;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPage extends BasePage {
	
	public AmazonPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement amazonsearch;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchclick;
	
	@FindBy(xpath="//span[1][contains(text(),'iPhone 14 Plus (128 GB) - Yellow')]")
	WebElement selectedphnprice;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-none aok-align-center']//span[@class='a-offscreen' and text()='₹69,999']")
	WebElement getpricevalue;
	
	public void search(String input) {
		amazonsearch.click();
		amazonsearch.sendKeys(input);
		searchclick.click();
		selectedphnprice.click();
		
		}
	
	public String getwindow() {
		Set<String> allwindows = driver.getWindowHandles();
		Object[] windows= allwindows.toArray();
		String window1 = windows[0].toString();
		  String window2 = windows[1].toString();
		  driver.switchTo().window(window2);
		  return window2;
		  
	}
	    public String getpriceamz() {
	 
		String sd = getpricevalue.getAttribute("innerHTML");
		System.out.println(sd);
		return sd;
		
		
		
		
		
	}
	
	

}
