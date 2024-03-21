package shoppersstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "Login")
	private WebElement loginButton;
	
	@FindBy(id = "Forgot Password?")
	private WebElement forgotPasswordButton;
	
	@FindBy(xpath = "//span[text()='Create Account']")
	private WebElement createAccountButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getForgotPasswordButton() {
		return forgotPasswordButton;
	}
	
	public void loginAction(String email, String password) {
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	
	public void clickOnForgotPasswordButton() {
		forgotPasswordButton.click();
	}
	
	public void clickOnCreateAccountButton() {
		createAccountButton.click();
	}
}
