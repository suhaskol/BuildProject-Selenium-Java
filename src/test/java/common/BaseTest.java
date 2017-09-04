/**
 * 
 */
package common;

import org.openqa.selenium.WebDriver;

/**
 * @author csudheer
 *
 */
public class BaseTest {

	protected WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
