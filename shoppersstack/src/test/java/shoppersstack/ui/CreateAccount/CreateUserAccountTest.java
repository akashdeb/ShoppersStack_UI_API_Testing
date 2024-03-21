package shoppersstack.ui.CreateAccount;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtils.BaseClass;
import genericUtils.IPathConstant;
import shoppersstack.pom.CartPage;
import shoppersstack.pom.HomePage;
import shoppersstack.pom.LandingPage;
import shoppersstack.pom.LoginPage;
import shoppersstack.pom.MenTshirtPage;
import shoppersstack.pom.SignUpPage;

public class CreateUserAccountTest extends BaseClass {
	
	@Test(priority = 1, enabled = false)
	public void createAccount() throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		String firstName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Create_Account_Sheet_Name, 1, 0);
		String lastName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Create_Account_Sheet_Name, 1, 1);
		String gender = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Create_Account_Sheet_Name, 1, 2);
		long phoneNo = eUtils.fetchNumericDataFromExcelSheet(IPathConstant.Create_Account_Sheet_Name, 1, 3);
		String email = fkUtils.generateEmail();
		String password = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Create_Account_Sheet_Name, 1, 5);

		LandingPage land = new LandingPage(driver);
		LoginPage login = new LoginPage(driver);
		SignUpPage signUp = new SignUpPage(driver);
		
		land.clickOnLoginButton();
		login.clickOnCreateAccountButton();
		signUp.enterFirstName(firstName);
		signUp.enterLastName(lastName);
		signUp.clickOnGender(gender);
		signUp.enterPhoneNo(phoneNo);
		signUp.enteremail(email);
		signUp.enterPassword(password);
		signUp.confirmPassword(password);
		signUp.agreeToTermsAndCondition();
		
		wUtils.waitForElementToBeClickable(driver, signUp.getRegisterButton());
		signUp.clickOnRegisterButton();
		wUtils.waitForElementToBeClickable(driver, land.getSignUpMsg());
		Assert.assertTrue(land.verifySignUp());
		System.out.println("The user has signed up");
		land.clickOnSignUpMsgCloseButton();

	}

}
