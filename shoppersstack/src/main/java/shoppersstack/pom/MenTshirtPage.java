package shoppersstack.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class MenTshirtPage {
	WebDriver driver;
	
	public MenTshirtPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void addMenTshirt(String productName) {
	
		driver.findElement(By.xpath("//span[contains(text(),'"+productName+"')]/../..//button[text()='add to cart']")).click();
	}

}
