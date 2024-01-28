package testclass;


import org.testng.annotations.Test;

import Page.Alerts;
import testBase.BaseClass;

public class AlertsTest extends BaseClass {
	
	
	@Test
	public void alertstesting() throws InterruptedException {
		Alerts als = new Alerts(driver);
		/*als.browserwindows();
		String exp="This is a sample page";
		String act = als.textverify();
		if(exp.equalsIgnoreCase(act)) {
			System.out.println(act);
		}
		else
			System.out.println(exp);*/
		
		//als.Alertsfunctions();
		/*als.framesfunctions();
		String exp="This is a sample page";
		String act = als.msgverify();
		if(exp.equalsIgnoreCase(act)) {
			System.out.println(act);
		}
		else
			System.out.println(exp);	 
	}*/
		//als.nestedframes();
		als.modals();
	
	 
	}
}
