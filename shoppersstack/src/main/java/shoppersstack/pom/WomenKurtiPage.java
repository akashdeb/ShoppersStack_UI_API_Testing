package shoppersstack.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenKurtiPage {
	WebDriver driver;
	
	public WomenKurtiPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath = "//a[text()='women kurti']")
	private  WebElement womenKurtiText;
	
	public void addWomenKurti(String productName) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(womenKurtiText).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+productName+"']/../..//button")).click();
	}

}
