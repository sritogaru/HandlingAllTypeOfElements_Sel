package Page;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Widgets extends BasePage {
	
	public Widgets(WebDriver driver) {
		
		super(driver);
	}
 
	//Accordian
	 @FindBy(xpath="//h5[contains(text(),'Widgets')]")
	   WebElement Widgetsclick;
	 @FindBy(xpath="//span[contains(text(),'Accordian')]")
	WebElement Accordianlink;
	 @FindBy(xpath="//div[@id='section2Heading']")
	 WebElement text2;
	 
	 
	public void widgetslinkclick() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", Widgetsclick);
		 Widgetsclick.click();
		 Accordianlink.click();
		 text2.click();
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", text2);
		 text2.click();
	 	
}
	//For Auto complete
	@FindBy(xpath="//span[contains(text(),'Auto Complete')]")
	   WebElement autocompleteclick;
	@FindBy(xpath="//input[@id='autoCompleteMultipleInput']")
	WebElement multitextbox;
	
	public void inputmultitext(String input1,String input2,String input3) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", Widgetsclick);
		 Widgetsclick.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", autocompleteclick);
		autocompleteclick.click();
		multitextbox.sendKeys(input1);
		multitextbox.sendKeys(Keys.ENTER);
		multitextbox.sendKeys(input2);
		multitextbox.sendKeys(Keys.ENTER);
		multitextbox.sendKeys(input3);
		multitextbox.sendKeys(Keys.ENTER);
	}
	
	//Calender
	//For Auto complete
		@FindBy(xpath="//span[contains(text(),'Date Picker')]")
		   WebElement datepickerclick;
		@FindBy(xpath="//input[@id='datePickerMonthYearInput']")
		WebElement selectdate;
		@FindBy(xpath="//select[@class='react-datepicker__month-select']")
		WebElement month;
		@FindBy(xpath="//select[@class='react-datepicker__year-select']")
		WebElement year;
		@FindBy(xpath="//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']")
	    WebElement MnYr;
		@FindBy(xpath="//button[@class='react-datepicker__navigation react-datepicker__navigation--next react-datepicker__navigation--next--with-time']")
		WebElement nextbtn;
		@FindBy(xpath="//div[@class='react-datepicker__month']//div")
		List<WebElement> allDates;
		@FindBy(xpath="//input[@id='dateAndTimePickerInput']")
		WebElement dateandtime;
		@FindBy(xpath="//div[@class='react-datepicker-time__header']")
		WebElement timedrodpwn;
		@FindBy(xpath="//div[@class='react-datepicker__time-box']/ul/li")
		List<WebElement> alltimes;
		
		
		   public void selectdate() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].scrollIntoView();", Widgetsclick);
			 Widgetsclick.click();
			 datepickerclick.click();
			 /*String monyr = "August 2002";
			 String dt = "16";
			 String tme= "8:45 AM";
			 selectdate.click();
			 

		//select month & year
		while(true)
			{
			String monthyear=MnYr.getText();
					
			if(monthyear.equals(monyr))
				{
				break;
				}
			 
           nextbtn.click();//next
		//driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--previous']")).click();//previous
		}
		//select date
		
				for(WebElement dte:allDates)
				{
					if(dte.getText().equals(dt))
					{
						dte.click();
						break;
					}
				} */
				
				
		      
}
		   public void datetime(){
			   JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("arguments[0].scrollIntoView();", Widgetsclick);
				 Widgetsclick.click();
				 datepickerclick.click();
			     String monyr = "August 2030";
				 String dt = "16";
				 String tme= "08:15 AM";
				 dateandtime.click();
				 
			//select month & year
			while(true)
				{
				String monthyear=MnYr.getText();
						
				if(monthyear.equals(monyr))
					{
					break;
					}
				 
	           nextbtn.click();//next
			//driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--previous']")).click();//previous
			}
			//select date
			
					for(WebElement dte:allDates)
					{
						if(dte.getText().equals(dt))
						{
							dte.click();
							break;
						}
					} 
					
					for(WebElement timestamp: alltimes)
					{
						if(timestamp.getText().equals(tme))
						{
							timestamp.click();
							break;
						}
					}
		  
		  }
	
		   //for slider
		   @FindBy(xpath="//span[contains(text(),'Slider')]")
		   WebElement sliderclick;
		   @FindBy(xpath="//input[@type='range']")
		   WebElement dragslider;
		   
		   public void slider() {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", Widgetsclick);
			 Widgetsclick.click();
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView();", sliderclick);
				 sliderclick.click();
			   Actions move = new Actions(driver);
			    move.dragAndDropBy(dragslider, 50, 0).build().perform();   
		   }
		   //For ProgressBar
		   @FindBy(xpath="//span[contains(text(),'Progress Bar')]")
		   WebElement Progressbarclick;
		   @FindBy(xpath="//button[@id='startStopButton']")
		   WebElement progressbarbtn;
		   @FindBy(xpath="//button[@id='resetButton']")
		   WebElement resetbtn;
		   
		   public void progressbar() {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", Widgetsclick);
			 Widgetsclick.click();
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView();", Progressbarclick);
				Progressbarclick.click();
			 progressbarbtn.click();
			 resetbtn.click();
		   }
		   
		 //for tabs
		   @FindBy(xpath="//span[contains(text(),'Tabs')]")
		   WebElement tabsclick;
		   @FindBy(xpath="//a[@id='demo-tab-origin']")
		   WebElement origintab;
		   @FindBy(xpath="//a[@id='demo-tab-use']")
		   WebElement usetab;
		 
		   public void tabs() {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", Widgetsclick);
			 Widgetsclick.click(); 
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView();", tabsclick);
				tabsclick.click();
				origintab.click();
				usetab.click();
		   }
		   //for tooltip
		   @FindBy(xpath="//span[contains(text(),'Tool Tips')]")
		   WebElement tooltipclick;
		   @FindBy(xpath="//button[contains(text(),'Hover me to see')]")
		   WebElement hovermetosee;
		   @FindBy(xpath="//input[@placeholder='Hover me to see']")
		   WebElement hovermetoseetextbox;
		   @FindBy(xpath="//a[contains(text(),'Contrary')]")
		   WebElement contrarytext;
		   
		   public void tooltips(String text) {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", Widgetsclick);
			 Widgetsclick.click(); 
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView();", tooltipclick);
			 tooltipclick.click();
			 Actions act = new Actions(driver);
			 act.moveToElement(hovermetosee).build().perform();
			 act.moveToElement(hovermetoseetextbox).build().perform();
			hovermetoseetextbox.sendKeys(text);
		   }
			 /*public String hovertextdisplay() {
				 String sd =  hovermetosee.getAttribute("title"); 
				 return sd;
			 }*/
			 
			 //act.moveToElement(hovermetoseetextbox).click();
			 //act1.moveToElement(hovermetoseetextbox).sendKeys("demo");
			 //Actions act2 = new Actions(driver);
			 //act2.moveToElement(contrarytext).click();
			 
		   //menu
		   @FindBy(xpath="//span[contains(text(),'Menu')]")
		   WebElement menuclick;
		   @FindBy(xpath="//a[text()='Main Item 1']")
		   WebElement mainitem1;
		   @FindBy(xpath="//a[text()='Main Item 2']")
		   WebElement mainitem2;
		   @FindBy(xpath="//a[text()='SUB SUB LIST »']")
		   WebElement subsublist;
		   @FindBy(xpath="//a[text()='Sub Sub Item 2']")
		   WebElement subitem2;
		   
		   public void menus() throws InterruptedException {
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", Widgetsclick);
			 Widgetsclick.click(); 
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView();", menuclick);
				menuclick.click();
				//mainitem1.click();
				Actions action = new Actions(driver);
				action.moveToElement(mainitem2).click().build().perform();
				action.moveToElement(subsublist).click().build().perform();
				action.moveToElement(subitem2).click().build().perform();
				
		   }
			 
		   //select menu
		   @FindBy(xpath="//span[contains(text(),'Select Menu')]")
		   WebElement selectmenuclick;
		   @FindBy(xpath="//div[@id='withOptGroup']")
		   WebElement selectvalue;
		   @FindBy(xpath="//div[@class=' css-yt9ioa-option']")
		   List<WebElement> dropdownvalue;
		   @FindBy(xpath="//div[@id='selectOne']")
		   WebElement selectone;
		   @FindBy(xpath="//div[contains(text(),'Ms.')]")
		   WebElement dropdown2;
		   @FindBy(xpath="//select[@id='oldSelectMenu']")
		   WebElement oldstyledropdown;
		   @FindBy(xpath="//select[@id='cars']")
		   WebElement volvodropdown;
		   
		   public void selectmenus() {
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", Widgetsclick);
			 Widgetsclick.click(); 
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView();", selectmenuclick);
				selectmenuclick.click(); 
				selectvalue.click();
				
				for(WebElement sd: dropdownvalue) {
					String text=sd.getText();
					if(text.equals("A root option")) {
						sd.click();
						break;
					}
				}
				selectone.click();
			    dropdown2.click();
			    Select sc = new Select(oldstyledropdown);
			    sc.selectByIndex(4);
			    Select sc1 = new Select(volvodropdown);
			    sc1.selectByValue("audi");
			    
					}
				
				
				
		   }				
		  


			
	
			
			
			
			
			
			
			
			
			
			
	

