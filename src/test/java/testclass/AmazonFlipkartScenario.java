package testclass;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Page.AmazonPage;
import Page.FlipkartPage;
import junit.framework.Assert;
import testBase.BaseClass;

public class AmazonFlipkartScenario extends BaseClass {
	
	@Test
	public void selectphoneamazon() throws InterruptedException {
		
		AmazonPage ap = new AmazonPage(driver);
		ap.search("iPhone 14 Plus (256 GB) - Yellow");
		ap.getwindow();
		String price1= ap.getpriceamz();
		
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		   driver.switchTo().window(tabs.get(2));
		   driver.get("https://www.flipkart.com"); 
		FlipkartPage fp = new FlipkartPage(driver);
		fp.search("iPhone 14 Plus (256 GB) - Yellow");
		Thread.sleep(3000);
		fp.getwindow3();
		String price2 = fp.getpricefpk();
		
		String rupee_amz = price1.replace("₹","");
		System.out.println(rupee_amz);
		String value = "69,999";
		value = value.replaceAll(",", "");
		int amzprice = Integer.parseInt(value);
		System.out.println(amzprice);
		String rupee_fkp = price2.replace("₹","");
		System.out.println(rupee_fkp);
		String val = "76,999";
		val = val.replaceAll(",", "");
		int fpkprice = Integer.parseInt(val);
		System.out.println(fpkprice);
	
		int Finalprice_min = Math.min(amzprice, fpkprice);
		System.out.println("₹"+Finalprice_min);
				
		
		
		
		
		
		
		
		
	}
}
