package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Payments;

public class CheckOutFlowTest {

	HomePage homepage = new HomePage();
	Payments ReviewOrder = new Payments();
	
	@Test
	public void verifyCheckOutFlow(){
	
		homepage.navigateToUrl();
		
		// searching for first product with quantity one 1
		
		homepage.enterSearchDataAndAddItToCart("Suede Kohler K66266U","1");
		
		// searching for second product with quantity one 1
		
		homepage.enterSearchDataAndAddItToCart("Cashmere Kohler K66266U","1");
		// searching for third product with quantity two
		
		homepage.enterSearchDataAndAddItToCart("Kohler K-5180-ST","2");
		//homepage.enterSearchDataAndAddItToCart("Kohler K-5180-ST");
		homepage.clickOnCartBtn();
		// filling shipping and card details if the user not saved any information shipping information
		ReviewOrder.FillingShippingAddress( "firstname","String lastname","companyname","String address1","String address2","32423","24234243234" );
		
		/*Build.com, Inc. is located in California and we are obligated to collect California Sales Tax on any items shipped to destinations in California. Sales Tax is collected for all orders shipping to California unless a valid resale certificate is presented prior to purchase. The current sales tax rate is 7.25%.*/
		
		
		// asserting grand tax and grand total.
		
		Assert.assertEquals(homepage.tax(), homepage.CAtax());
		
		Assert.assertEquals(homepage.totalActual(), homepage.totalExpected());
		
	}
	
}


