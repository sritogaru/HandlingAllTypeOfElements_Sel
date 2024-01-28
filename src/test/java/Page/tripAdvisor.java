package Page;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class tripAdvisor extends BasePage {
	
	public tripAdvisor(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//input[@type='search']")
	WebElement search;
	
	@FindBy(xpath="//span[contains(text(),'Club Mahindra Madikeri, Coorg')]")
	WebElement clickonlist;
	
	@FindBy(xpath="//div[@class='f u'][contains(text(),'Write a review')]")
	WebElement writereview;

	
	@FindBy(xpath="//div[@class='eHLVa']//input[@id='traveler-rating_5']")
	WebElement starclick;
	
	public void searchclub(String input) {
		search.sendKeys(input);
		search.sendKeys(Keys.ENTER);
		clickonlist.click();
	}
	public String windowhandling() {
		Set<String> allwindows = driver.getWindowHandles();
		Object[]windows = allwindows.toArray();
		
		String window1 = windows[0].toString();
		String window2 = windows[1].toString();
		driver.switchTo().window(window2);
		return window2;
		
	}
	
	public void reviewwrite() {
		writereview.click();
	}
	public String windowhandling2() {
		Set<String> allwindows = driver.getWindowHandles();
		Object[]windows = allwindows.toArray();
		
		String window1 = windows[0].toString();
		String window2 = windows[1].toString();
		String window3 = windows[2].toString();
		driver.switchTo().window(window3);
		return window3;
		
	}
	public void mousehover() {
	Actions act = new Actions(driver);
	act.moveToElement(starclick).click().build().perform();
		
	}
		
		
		

		
	}
	
	
	
	


