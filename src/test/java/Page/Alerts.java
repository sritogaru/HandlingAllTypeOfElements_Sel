package Page;


import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Alerts extends BasePage {
	
	public Alerts(WebDriver driver) {
		
		super(driver);
	}

	

	//For Alerts,frames and windows
	 @FindBy(xpath="//h5[contains(text(),'Alerts, Frame & Windows')]")
	   WebElement Alertsclick;
	 @FindBy(xpath="//span[contains(text(),'Browser Windows')]")
		WebElement browserwindowlink;
	 @FindBy(xpath="//button[@id='tabButton']")
	 WebElement newtab;
	 @FindBy(xpath="//button[@id='windowButton']")
	 WebElement newwindow;
	 @FindBy(xpath="//button[@id='messageWindowButton']")
	 WebElement newmsgwindow;
	 @FindBy(xpath="//h1[@id='sampleHeading']")
	 WebElement window2text;

	 //For Alerts
	 @FindBy(xpath="//span[contains(text(),'Alerts')]")
	   WebElement Alertsubclick;
	 @FindBy(xpath="//button[@id='alertButton']")
	   WebElement ClickAlertBtn;
	 @FindBy(xpath="//button[@id='timerAlertButton']")
	   WebElement timeralertBtn;
	 @FindBy(xpath="//button[@id='confirmButton']")
	   WebElement confirmalertBtn;
	 @FindBy(xpath="//button[@id='promtButton']")
	   WebElement prompttBtn;
	 
	 //For Frames
	 @FindBy(xpath="//span[contains(text(),'Frames')]")
	   WebElement framesclick;
	 @FindBy(xpath="//iframe[@id='frame2']")
	   WebElement frame2;
	 @FindBy(xpath="//h1[@id='sampleHeading']")
	 WebElement frametext;
	 
	 //nested frames
	 @FindBy(xpath="//span[contains(text(),'Nested Frames')]")
	   WebElement nestedframesclick;
	 @FindBy(xpath="//iframe[@id='frame1']")
	 WebElement parentframe;
	 @FindBy(xpath="//body/iframe[1]")
	 WebElement childframe;
	 
	 //For modal dialogs
	 @FindBy(xpath="//span[contains(text(),'Modal Dialogs')]")
	   WebElement modaldialogs;
	 @FindBy(xpath="//button[@id='showSmallModal']")
	 WebElement smalldialog;
	 @FindBy(xpath="//button[@id='closeSmallModal']")
	 WebElement closesmalldialog;
	 @FindBy(xpath="//button[@id='showLargeModal']")
	 WebElement largedialog;
	 @FindBy(xpath="//button[@id='closeLargeModal']")
	 WebElement closelargedialog;

   public void browserwindows() throws InterruptedException {
	   JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Alertsclick);
	   Alertsclick.click();
	   browserwindowlink.click();
	   //newtab.click();
	   newwindow.click();
	   newmsgwindow.click();
	   Set<String> allwindows = driver.getWindowHandles();
	   Object[] windows= allwindows.toArray();
	   String window1 = windows[0].toString();
	   String window2 = windows[1].toString();
	   driver.switchTo().window(window2);
	   
   }
   
     public String textverify() {
    	 return window2text.getText();
     }

   public void Alertsfunctions() throws InterruptedException {
	   JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Alertsclick);
		Alertsclick.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Alertsubclick);
	   Alertsubclick.click();
	   //ClickAlertBtn.click();
	   //timeralertBtn.click();
	   //confirmalertBtn.click();
	   prompttBtn.click();
	   WebDriverWait wait = new WebDriverWait(driver,20);
	   wait.until(ExpectedConditions.alertIsPresent());
	   Alert al = driver.switchTo().alert(); 
	   //al.sendKeys("sridevi");
	   al.dismiss();
	   
   }
   
   public void framesfunctions() {
	   JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Alertsclick);
	   Alertsclick.click();
	   JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", framesclick);
	   framesclick.click();
	   JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", frame2);
	   driver.switchTo().frame(frame2);
   }
    public String msgverify() {
    	return frametext.getText();
    }

  public void nestedframes() {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Alertsclick);
	   Alertsclick.click();
	   nestedframesclick.click();
	   JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", parentframe);
	   driver.switchTo().frame(childframe);
	   
  }
  public void modals() {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Alertsclick);
	    Alertsclick.click();
		modaldialogs.click();
		//smalldialog.click();
		//closesmalldialog.click();
		largedialog.click();
		closelargedialog.click();
	  
  }
}