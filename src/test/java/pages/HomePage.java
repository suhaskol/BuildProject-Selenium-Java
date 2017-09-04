package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.Selenide;

public class HomePage  extends Selenide{

	
	@FindBy(id = "search_txt")
	private WebElement searchBar;
	
	@FindBy(css = "button[class='button-primary search-site-search']")
	private WebElement searchBarImg;
	
	@FindBy(css = "//button[contains(text(),'Add to Cart')]")
	private WebElement addToCartBtn;
	
	@FindBy(css = "//span[contains(text(),'Cart')]")
	private WebElement CartBtn;
	
	@FindBy(css = "//span[class='js-price ']")
	private WebElement price;
	
	@FindBy(xpath = "//*[@id='main-product-quantity']/div/input")
	private WebElement Quantity;
	
	@FindBy(id="cart-tax-total")
	private WebElement ActualTax;
	// 
	@FindBy(id="cart-grand-total")
	private WebElement Grandtotal;
	
	@FindBy(xpath = "//*[@id='item-136021498']/td[4]")
	private WebElement item1;
	
	@FindBy(xpath = "//*[@id='item-136021717']/td[4]")
	private WebElement item2;
	
	
	
	public void navigateToUrl(){
		openDriver();
		getUrl("https://www.build.com");
	}
	
	public void enterSearchDataAndAddItToCart(String data,String QTY){
		pageToLoad();
		
		
		
		
		sendText(searchBar, data);
		clickElement(searchBarImg);
		clickElement(addToCartBtn);
		sendText(Quantity,QTY);
		System.out.println(price());
	}
	
	public void clickOnCartBtn(){
		clickElement(CartBtn);
	}
	
	public double price(){
		//return Integer.parseInt(price.getText());
		return Double.parseDouble(price.getText());
	
	}
	
	public float tax(){
		return Float.parseFloat(ActualTax.getText());
	}
	
	public float totalActual(){
		
		return Float.parseFloat(item1.getText()) + Float.parseFloat(item2.getText());
	}
	
	public float CAtax(){
		return totalActual()*(725/100);
	}


public float totalExpected(){
		
		return Float.parseFloat(Grandtotal.getText());
	}

	
}
