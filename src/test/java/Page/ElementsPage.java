package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {
	
public ElementsPage(WebDriver driver) {
		
		super(driver);
	}

    //For TextBox
	@FindBy(xpath="//span[contains(text(),'Text Box')]")
	WebElement textboxlink;
	
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
	
	//For Checkbox
	@FindBy(xpath="//span[contains(text(),'Check Box')]")
	WebElement checkboxlink;
	@FindBy(xpath="//button[@class='rct-option rct-option-expand-all']")
	WebElement expandall;
	@FindBy(xpath="//span[contains(text(),'Office')]")
	WebElement officecheckbox;
	@FindBy(xpath="//button[@class='rct-option rct-option-collapse-all']")
	WebElement collapseall;
	
	//For Radiobutton
	@FindBy(xpath="//span[contains(text(),'Radio Button')]")
	WebElement radiobtnlink;
	@FindBy(xpath="//label[text()='Impressive']")
	WebElement impressiveradiobtn;
	
	//For WebTables
	@FindBy(xpath="//span[contains(text(),'Web Tables')]")
	WebElement webtableslink;
	@FindBy(xpath="//button[@id='addNewRecordButton']")
	WebElement addbtn;
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement Fname;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement Lname;
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement Mail;
	@FindBy(xpath="//input[@id='age']")
	WebElement Age;
	@FindBy(xpath="//input[@placeholder='Salary']")
	WebElement Salary;
	@FindBy(xpath="//input[@id='department']")
	WebElement Department;
	@FindBy(xpath="//button[@id='submit']")
	WebElement submit;
	
	//For Buttons
	@FindBy(xpath="//span[contains(text(),'Buttons')]")
	WebElement Buttonslink;
	@FindBy(xpath="//button[@id='doubleClickBtn']")
	WebElement doubleclick;
	@FindBy(xpath="//button[@id='rightClickBtn']")
	WebElement rightclick;
	
	//For Links
		@FindBy(xpath="//span[contains(text(),'Links')]")
		WebElement linkslink;
		@FindBy(xpath="//a[@id='simpleLink']")
		WebElement homelink;
		@FindBy(xpath="//a[@id='created']")
		WebElement created;
		@FindBy(xpath="//p[@id='linkResponse']")
		WebElement text;
		@FindBy(xpath="//a[@id='no-content']")
		WebElement nocontent;
	
	//For Upload&Download
	@FindBy(xpath="//span[contains(text(),'Upload and Download')]")
	WebElement UploadDownload;
	@FindBy(xpath="//a[contains(text(),'Download')]")
	WebElement downloadbtn;
	@FindBy(xpath="//input[@type='file']")
	WebElement fileupload;
	
	
	//For TextBox
	public void textboxClick() {
		textboxlink.click();
	}
	public void Enterdetails(String fname, String email, String curadd, String peradd) {
		Fullname.sendKeys(fname);
		Email.sendKeys(email);
		currentaddress.sendKeys(curadd);
		permanentaddress.sendKeys(peradd);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", submitbtn);
		submitbtn.click();	
	}
	
	//For Checkbox
	public void CheckBoxfunctions() {
		checkboxlink.click();
		expandall.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", officecheckbox);
		officecheckbox.click();
		js.executeScript("arguments[0].scrollIntoView();", collapseall);
		collapseall.click();
	}
	
	//For Radiobutton
	public void radiobtns() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", radiobtnlink);
		radiobtnlink.click();
		impressiveradiobtn.click();	
	}
	//For Webtables
	public void webtablelinkclick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", webtableslink);
		webtableslink.click();
		addbtn.click();
		
	}
	public void EnterdetailsforWebtable(String FN, String LN,String mailid, String age, String sal, String Depar) {
		Fname.sendKeys(FN);
		Lname.sendKeys(LN);
		Mail.sendKeys(mailid);
		Age.sendKeys(age);
		Salary.sendKeys(sal);
		Department.sendKeys(Depar);
		submit.click();
		
	}
	
	//For Buttons
	public void buttonclick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Buttonslink);
		Buttonslink.click();
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		act.contextClick(rightclick).perform();	
	}
	
	//For links
	public void linksclick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", linkslink);
		linkslink.click();
		//homelink.click();
	}
		public void createdlink() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", nocontent);
			nocontent.click(); 
		 }
		public String createdmsgverify() {
			return text.getText();
		}
		
		//For Download&Upload
		public void updownload() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", UploadDownload);
			UploadDownload.click();
			downloadbtn.click();
			fileupload.sendKeys("C:\\Sridevi\\Postman\\students.json");
		}
	}


