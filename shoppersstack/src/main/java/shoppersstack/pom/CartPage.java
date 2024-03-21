package shoppersstack.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtils.WebDriverUtility;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath = "//span[contains(text(), 'Actual Price')]/..//span[2]")
	private WebElement actualPrice;
	
	@FindBy(xpath = "//span[contains(text(), 'Discount Price')]/..//span[2]")
	private WebElement discountedPrice;
		
	@FindBy(xpath = "//span[contains(text(), 'Delivery Charges')]/..//span[2]")
	private WebElement delivaryCharges;
		
	@FindBy(xpath = "//span[contains(text(), 'Total Price')]/..//span[2]")
	private WebElement totalPrice;
	
	@FindBy(xpath = "//button[@id='buynow_fl']")
	private WebElement buyNowButton;
	
	@FindBy(xpath = "//span[text()='Continue Shopping']")
	private WebElement continueShopping;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesButtonInPopUp;
	
	public WebElement getActualPrice() {
		return actualPrice;
	}

	public WebElement getDiscountedPrice() {
		return discountedPrice;
	}

	public WebElement getDelivaryCharges() {
		return delivaryCharges;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getBuyNowButton() {
		return buyNowButton;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}
	
	public void verifyAllProduct(String productName) {
		
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.verifyContentInAPage(driver, productName);
	}
	

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getYesButtonInPopUp() {
		return yesButtonInPopUp;
	}

	public void removeFromProductsFromCart() throws InterruptedException {
		
		List<WebElement> allButtons = driver.findElements(By.xpath("//button[text()='Remove from cart']"));
		
		for(WebElement button:allButtons) {
			Thread.sleep(1000);
			button.click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("(//button[text()='Yes'])[1]")).click();

		}
	}
	
	
}
