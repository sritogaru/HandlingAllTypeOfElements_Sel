package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Forms extends BasePage {
	
public Forms(WebDriver driver) {
		
		super(driver);
	}

//For Forms
   @FindBy(xpath="//h5[contains(text(),'Forms')]")
   WebElement Formsclick;
	@FindBy(xpath="//span[contains(text(),'Practice Form')]")
	WebElement practiceformlink;
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstname;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname;
	@FindBy(xpath="//input[@placeholder='name@example.com']")
	WebElement email;
	@FindBy(xpath="//label[contains(text(),'Female')]")
	WebElement gender;
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	WebElement mobilenum;
	//@FindBy(xpath="//input[@type='text']")
	//WebElement dob;
	
	@FindBy(xpath="//input[@id='subjectsInput']")
	WebElement subjects;
	//@FindBy(xpath="//input[@class='custom-control-input' and @type='checkbox']")
	@FindBy(xpath="//label[contains(text(),'Reading')]")
	WebElement checkbox;
	@FindBy(xpath="//input[@type='file']")
	WebElement upload;
	@FindBy(xpath="//textarea[@placeholder='Current Address']")
	WebElement currentadd;
	

	
	public void forms() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Formsclick);
		Formsclick.click();
		practiceformlink.click();
		
	}
	public void formdetails(String fn, String ln, String mail, String mobile, String subject,String subject1,String curadd) throws InterruptedException {
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		email.sendKeys(mail);
		gender.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", mobilenum);
		mobilenum.sendKeys(mobile);
		
		
		Thread.sleep(2000);
		subjects.sendKeys(subject);
		subjects.sendKeys(Keys.TAB);
		subjects.sendKeys(subject1);
		subjects.sendKeys(Keys.TAB);
		checkbox.click();
		upload.sendKeys("C:\\Sridevi\\Postman\\students.json");
		currentadd.sendKeys(curadd);
	}
	
}
