package shoppersstack.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenShirtPage {
	WebDriver driver;
	public MenShirtPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath = "//a[text()='men shirt']")
	private  WebElement menShirtText;
	
	public void addMenShirt(String productName) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(menShirtText).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(), '"+productName+"')]/../..//button")).click();
	}

}
