package shoppersstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "loginBtn")
	private WebElement loginButton;

	@FindBy(xpath = "//div[text()='Successfully Registered']")
	private WebElement signUpMsg;
	
	@FindBy(xpath = "//button[@class=\"Toastify__close-button Toastify__close-button--light\"]")
	private WebElement signUpMsgCLoseButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getSignUpMsg() {
		return signUpMsg;
	}



	public WebElement getSignUpMsgCLoseButton() {
		return signUpMsgCLoseButton;
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public boolean verifySignUp() {
		
		return signUpMsg.isDisplayed();
	}
	
	public void clickOnSignUpMsgCloseButton() {
		signUpMsgCLoseButton.click();
	}
	

}
