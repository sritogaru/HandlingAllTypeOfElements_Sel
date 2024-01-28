package testclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import Page.Widgets;
import testBase.BaseClass;

public class WidgetsTest extends BaseClass {
	
	
	@Test
	public void widgets() throws InterruptedException {
		
		Widgets wt = new Widgets(driver);
		//wt.widgetslinkclick();
		//wt.inputmultitext("g", "y", "w");
		//wt.selectdate();
		//wt.datetime();
		//wt.slider();
		//wt.progressbar();
		//wt.tabs();
		//wt.tooltips(randomString());
		//wt.hovertextdisplay();
			//System.out.println(wt.hovertextdisplay());
		//wt.menus();
		wt.selectmenus();
		
		
	}
}
