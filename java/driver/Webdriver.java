package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver {
	
	public WebDriver wd ;

	public void Chromedriver(String link) {
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get(link);
	}
	
	public void Edgedriver(String link) {
		WebDriverManager.edgedriver().setup();
		wd = new EdgeDriver();
		wd.manage().window().maximize();
		wd.get(link);
	}
	
	public void Firefoxdriver(String link) {
		WebDriverManager.firefoxdriver().setup();
		wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get(link);
	}
	
	public void quit() {
		wd.quit();
	}
}
