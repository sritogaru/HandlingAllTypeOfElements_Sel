package interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebInteractions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\salad\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com");
		//driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
		Thread.sleep(1000);
		 /*WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 driver.switchTo().frame(frame);
			WebElement drag = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
			WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
			Actions builder = new Actions(driver);
			Action dragAndDrop = builder.clickAndHold(drag).moveToElement(drop).release(drop).build();
			dragAndDrop.perform();*/
	
		 
		 Actions builder = new Actions(driver);
		 WebDriverWait wait = new WebDriverWait(driver, 30);

		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='demo-frame']")));
		 WebElement resizeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resizable']//div[3]")));
		 builder.dragAndDropBy(resizeButton, 50, 50).build().perform();	
			
					
		} 

	}


