package shoppersstack.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//a[@id='men']")
	private WebElement menDropdown;

	@FindBy(xpath = "//a[@id='women']")
	private WebElement womenDropdown;

	@FindBy(xpath = "//a[@id='kids']")
	private WebElement kidsDropdown;

	@FindBy(id = "//a[@id='beautyProducts']")
	private WebElement beautyProductsDropdown;

	@FindBy(id = "//a[@id='electronics']")
	private WebElement electronicsDropdown;

	@FindBy(id = "cart")
	private WebElement cartButton;

	@FindBy(id = "search")
	private WebElement searchTextField;

	@FindBy(xpath = "//div[text()='R']")
	private WebElement profileButton;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutOption;
	
	public WebElement getMenDropdown() {
		return menDropdown;
	}

	public WebElement getWomenDropdown() {
		return womenDropdown;
	}

	public WebElement getKidsDropdown() {
		return kidsDropdown;
	}

	public WebElement getBeautyProductsDropdown() {
		return beautyProductsDropdown;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getProfileButton() {
		return profileButton;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getElectronicsDropdown() {
		return electronicsDropdown;
	}


	public WebElement getLogoutOption() {
		return logoutOption;
	}

	public void mouseHoverOnMenAndSelectOption(String option) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(menDropdown).perform();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='"+option+"']")).click();
	}
	
	public void mouseHoverOnWomenDropdownAndSelectOption(String option) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(womenDropdown).perform();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='"+option+"']")).click();
		
	}
	
	public void mouseHoverOnKidsDropdownAndSelectOption(String option) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(kidsDropdown).perform();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='"+option+"']")).click();
	}
	
	
	public void mouseHoverOnElectronicsDropdownAndSelectOption(String option) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(electronicsDropdown).perform();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='"+option+"']")).click();
	}
	
	
	public void mouseHoverOnBeautyProductsDropdownAndSelectOption(String option) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(beautyProductsDropdown).perform();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='"+option+"']")).click();
	}
	
	
	public void logoutAction() {
		profileButton.click();
		logoutOption.click();
	}
	

	

	public void clickOnCart() {
		cartButton.click();
	}

}
