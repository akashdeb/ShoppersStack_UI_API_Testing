package shoppersstack.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(id = "First Name")
	private WebElement firstName;

	@FindBy(id = "Last Name")
	private WebElement lastName;

	@FindBy(id = "Phone Number")
	private WebElement phoneNo;

	@FindBy(id = "Email Address")
	private WebElement emailAddress;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(id = "Confirm Password")
	private WebElement confirmPassword;

	@FindBy(id = "Terms and Conditions")
	private WebElement termsAndConditionCheckbox;

	@FindBy(id = "btnDisabled")
	private WebElement registerButton;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getTermsAndConditionCheckbox() {
		return termsAndConditionCheckbox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void clickOnGender(String gender) {

		List<WebElement> allGenders = driver.findElements(By.xpath("//input[@type=\"radio\"]"));

		for (WebElement radio : allGenders) {

			if (radio.getAttribute("id").equals(gender)) {
				driver.findElement(By.id("Male")).click();
			}

			else if (radio.getAttribute("id").equals(gender)) {
				driver.findElement(By.id("Female")).click();
			}

			else if (radio.getAttribute("id").equals(gender)) {
				driver.findElement(By.id("Other")).click();
			}

		}
	}

	public void enterFirstName(String fName) {

		firstName.sendKeys(fName);
	}

	public void enterLastName(String lName) {

		lastName.sendKeys(lName);
	}

	public void enterPhoneNo(long pNo) {

		phoneNo.sendKeys(""+pNo);
	}

	public void enteremail(String email) {

		emailAddress.sendKeys(email);
	}
	
	public void enterPassword(String psswrd) {

		password.sendKeys(psswrd);
	}
	
	public void confirmPassword(String psswrd) {

		confirmPassword.sendKeys(psswrd);
	}
	
	public void agreeToTermsAndCondition() {
		termsAndConditionCheckbox.click();
	}
	
	public void clickOnRegisterButton() {
		registerButton.click();
	}
}
