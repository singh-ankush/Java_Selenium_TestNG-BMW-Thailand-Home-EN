package runnable;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class runNG extends exe.Shadow_DOM {

	@BeforeTest
	public void rundriver() throws Exception{
		Edgedriver("https://www.bmw.co.th/en/home.html");
		Thread.sleep(2000);
	}
	
	@Test (priority = 1)
	public void shadowBypass() {
		remove_root();
	}
	
//	@Test
//	public void buttonPress() {
//		pressbutton();
//	}
	
	@Test (priority = 3)
	public void navPress() throws Exception {
		nav();
	}
	
	@Test (priority = 2)
	public void contactUS() throws Exception {
		footer_contactus();
	}
	
	@AfterTest
	public void quitDriver() {
		quit();
	}
}
