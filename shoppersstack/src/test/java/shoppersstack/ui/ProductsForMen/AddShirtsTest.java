package shoppersstack.ui.ProductsForMen;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtils.BaseClass;
import genericUtils.IPathConstant;
import shoppersstack.pom.CartPage;
import shoppersstack.pom.HomePage;
import shoppersstack.pom.MenShirtPage;
public class AddShirtsTest extends BaseClass {
	
	@Test(priority = 4)
	public void addShirts() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		
		String menProduct2 = eUtils.fetchStringDataFromExcelSheet(IPathConstant.home_Sheet_Name, 2, 0);
		
		String shirt1 = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Men_Shirts_Sheet_Name, 1, 0);
		
		HomePage home = new HomePage(driver);
		CartPage cart = new CartPage(driver);
		MenShirtPage menTShirts = new MenShirtPage(driver);
		
		home.mouseHoverOnMenAndSelectOption(menProduct2);
		
		menTShirts.addMenShirt(shirt1);
		
		System.out.println("All Tshirts are added");
		
		home.clickOnCart();
		cart.verifyAllProduct(shirt1);
		System.out.println("All Women Kurti are verified");
	
	}
	@Test(priority = 5)
	public void removeProduct() throws InterruptedException {
		CartPage cart = new CartPage(driver);
		
		cart.removeFromProductsFromCart();
		
		System.out.println("All products are removed");

	}	
	}
