package exe;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Shadow_DOM extends Home {

	public void remove_root() {
		WebElement wb = wd.findElement(By.tagName("epaas-consent-drawer-shell"));
		SearchContext shadow = wb.getShadowRoot();
		WebElement wShadow = shadow.findElement(By.cssSelector(".epaas")).findElement(By.cssSelector(".accept-button.button-primary"));
		wShadow.click();
	}
}
