package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//h5[contains(text(),'Elements')]")
	WebElement Elementsclick;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement Fullname;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement Email;
	
	@FindBy(xpath="//div[@id='currentAddress-wrapper']//textarea")
	WebElement currentaddress;
	
	@FindBy(xpath="//div[@id='permanentAddress-wrapper']//textarea")
	WebElement permanentaddress;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submitbtn;
	
	
	
	//div[@class='category-cards']/child::*/descendant::*/following-sibling::*/h5

	
	public void Clickelement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Elementsclick);
		Actions actions = new Actions(driver);

		actions.moveToElement(Elementsclick).click().perform();
		
	}

}
