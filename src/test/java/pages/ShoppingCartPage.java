package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.CommonPage;

public class ShoppingCartPage extends CommonPage {
	
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(css = "a[class*=js-checkout-button]")
	private WebElement checkOutBtn;
	
	public void clickOnCheckOutBtn(){
		clickElement(checkOutBtn);
	}

}
