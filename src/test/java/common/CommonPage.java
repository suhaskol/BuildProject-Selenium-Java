/**
 * 
 */
package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage extends BaseTest {

	public CommonPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getUrl(String url) {
		getDriver().get(url);
	}

	public void sendText(WebElement element, String data) {
		element.clear();
		element.sendKeys(data);
	}
	
	public void clearText(WebElement element) {
		element.clear();
	}

	public void clickElement(WebElement element) {
		
		element.isEnabled();
		element.click();
	}

	public void verifyElement(WebElement element) {
		element.isDisplayed();
	}
	
	public void pageToLoad(WebElement element1) throws InterruptedException  {
		
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.visibilityOf(element1));
		Thread.sleep(10000);
		
	}
	
}
