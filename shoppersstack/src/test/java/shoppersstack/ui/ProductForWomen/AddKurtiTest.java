package shoppersstack.ui.ProductForWomen;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtils.BaseClass;
import genericUtils.IPathConstant;
import shoppersstack.pom.CartPage;
import shoppersstack.pom.HomePage;
import shoppersstack.pom.WomenKurtiPage;

public class AddKurtiTest extends BaseClass {
	
	@Test(priority = 5)
	public void addProduct() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		String womenproduct1 = eUtils.fetchStringDataFromExcelSheet(IPathConstant.home_Sheet_Name, 1, 1);
		
		String kurti1 = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Women_Kurti_Sheet_Name, 1, 0);
		String kurti2 = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Women_Kurti_Sheet_Name, 2, 0);

		HomePage home=new HomePage(driver);
		WomenKurtiPage kurti = new WomenKurtiPage(driver);
		CartPage cart = new CartPage(driver);
		System.out.println(womenproduct1);
		System.out.println(kurti1);
		System.out.println(kurti2);

		home.mouseHoverOnWomenDropdownAndSelectOption(womenproduct1);
		kurti.addWomenKurti(kurti1);
		kurti.addWomenKurti(kurti2);
		System.out.println("All products are added");
		
		home.clickOnCart();
		cart.verifyAllProduct(kurti1);
		System.out.println("All Women Kurti are verified");
	
	}
	@Test(priority = 6)
	public void removeProduct() throws InterruptedException {
		CartPage cart = new CartPage(driver);
		
		cart.removeFromProductsFromCart();
		
		System.out.println("All products are removed");

		
	}
	
	
	
	

}
