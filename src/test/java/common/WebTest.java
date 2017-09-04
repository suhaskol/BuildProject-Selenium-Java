/**
 * 
 */
package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

/**
 * @author RK
 *
 */
public class WebTest extends BaseTest {


	/**
	 * Browser Configuration
	 * 
	 * @param browser
	 */
	@BeforeTest
	@Parameters("browser")
	public void getDriver(String browserType) {
		try {
			switch (browserType) {
			case "FF":
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case "Chrome":
				// this chrome driver is hard codded. Please give your system path if you want to run on chrome browser.	
				System.setProperty("webdriver.chrome.driver","C:\\AllInOne\\SeleniumDrivers\\chrome\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				break;
			
			}

		} catch (Exception e) {
			try {
				throw new Exception(e.getMessage());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

	}

	/**
	 * Close The Browser After Test
	 */
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	

}
