package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.CommonPage;

public class BeginCheckoutPage extends CommonPage {
	
	
	public BeginCheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "login_email")
	private WebElement emailAddTxtFld;
	
	
	@FindBy(id = "login_password")
	private WebElement pwdTxtFld;
	
	
	@FindBy(css = "button[name='loginSubmit']")
	private WebElement loginBtn;
	
	
	public void loginToBuild(String email,String pwd){
		
		sendText(emailAddTxtFld,email );
		sendText(pwdTxtFld,pwd );
		clickElement(loginBtn);
	}
		
}
