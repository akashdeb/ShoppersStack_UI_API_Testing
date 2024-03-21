package shoppersstack.ui.ProductsForMen;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtils.BaseClass;
import genericUtils.IPathConstant;
import shoppersstack.pom.CartPage;
import shoppersstack.pom.HomePage;
import shoppersstack.pom.LandingPage;
import shoppersstack.pom.LoginPage;
import shoppersstack.pom.MenTshirtPage;

public class AddTshirtsTest extends BaseClass {
	
	@Test(priority = 2)
	public void addTShirts() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		
		String menProduct1 = eUtils.fetchStringDataFromExcelSheet(IPathConstant.home_Sheet_Name, 1, 0);
		
		String tshirt1 = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Tshirt_Sheet_Name, 1, 0);
		String tshirt2 = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Tshirt_Sheet_Name, 2, 0);
		String tshirt3 = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Tshirt_Sheet_Name, 3, 0);
		String tshirt4 = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Tshirt_Sheet_Name, 4, 0);
		String tshirt5 = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Tshirt_Sheet_Name, 5, 0);

		HomePage home = new HomePage(driver);
		MenTshirtPage menTShirts = new MenTshirtPage(driver);
		CartPage cart = new CartPage(driver);

		home.mouseHoverOnMenAndSelectOption(menProduct1);
		
		menTShirts.addMenTshirt(tshirt1);
		Thread.sleep(2000);
		menTShirts.addMenTshirt(tshirt2);
		Thread.sleep(2000);
		menTShirts.addMenTshirt(tshirt3);
		Thread.sleep(2000);
		menTShirts.addMenTshirt(tshirt4);
		Thread.sleep(2000);
		menTShirts.addMenTshirt(tshirt5);	
		
		System.out.println("All Tshirts are added");
		
		home.clickOnCart();
		Thread.sleep(2000);
		cart.verifyAllProduct(tshirt1);
		cart.verifyAllProduct(tshirt2);
		cart.verifyAllProduct(tshirt3);
		cart.verifyAllProduct(tshirt4);
		cart.verifyAllProduct(tshirt5);
		
		System.out.println("All Products are verified");
		
	}
	
	
	
	@Test(priority = 3)
	public void removeProductsFromCart() throws InterruptedException {
		
		CartPage cart=new CartPage(driver);
		
		cart.removeFromProductsFromCart();
		System.out.println("All products are removed from the cart");
		
	}
	
}
