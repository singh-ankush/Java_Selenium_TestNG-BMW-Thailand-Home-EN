package exe;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home extends driver.Webdriver{
	
	public void pressbutton() {

		wd.findElement(By.id("button-34bc51dd9d")).click();
	}
	
	public void nav() throws Exception{
		for (int i = 1; i <= 5; i++) {
			String urlExp = wd.getCurrentUrl();
			Thread.sleep(1000);
			WebElement wl = wd.findElement(By.xpath("/html/body/header/div[2]/div/div/root-shell/div/nav[1]/div[2]/ul/li["+i+"]"));
			wl.click();
			String urlAct = wd.getCurrentUrl();
			if(urlExp.equals(urlAct)) {
				String comname = wl.findElement(By.tagName("span")).getText();
				if (comname.equals("Shop Online")) {
					shpol();
				}
				else {}
			}
			else {
			wd.navigate().back();
			}
		}
	}
	
	public void shpol() throws Exception {
		for (int i = 1; i < 5; i++) {
			WebElement wlx = wd.findElement(By.xpath("/html/body/header/div[2]/div/div/root-shell/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/ul/li["+i+"]/a/span"));
			
			if(wlx.getText().equals("Buy Available New Cars")) {
				
			}
			else {
				wlx.click();
				ArrayList<String> tabs = new ArrayList<String> (wd.getWindowHandles());
			    wd.switchTo().window(tabs.get(0));
				wd.navigate().to("https://www.bmw.co.th/en/home.html");
				wd.findElement(By.xpath("/html/body/header/div[2]/div/div/root-shell/div/nav[1]/div[2]/ul/li[4]/button")).click();
			}
		}
	}
	
	public void footer_contactus()throws Exception{
		JSEdown();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (int i = 0; i <= 5; i++) {
			Thread.sleep(1000);
			wd.findElement(By.cssSelector("#list-391caceb1d-"+i+" > span")).click();
			ArrayList<String> tabs = new ArrayList<String> (wd.getWindowHandles());
			if(tabs.size()>1) {
				wd.switchTo().window(tabs.get(1));
				wd.switchTo().window(tabs.get(1)).close();
				wd.switchTo().window(tabs.get(0));
			}
			else if(tabs.size()==1) {
				wd.navigate().back();
			}
		}
		JSEup();
	}
}
