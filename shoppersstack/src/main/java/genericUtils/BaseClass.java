package genericUtils;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import shoppersstack.pom.HomePage;
import shoppersstack.pom.LandingPage;
import shoppersstack.pom.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();
	public ExcelUtility eUtils = new ExcelUtility();
	public JavaUtility jUtils = new JavaUtility();
	public WebDriverUtility wUtils = new WebDriverUtility();
	public DataBaseUtility dUtils = new DataBaseUtility();
	public FakeDataUtils fkUtils = new FakeDataUtils();
	public static WebDriver sDriver;

	@BeforeClass
	public void setUp() throws IOException, InterruptedException {

		String browser = fUtils.fetchDataFromPropertyFile("browser");
		String url = fUtils.fetchDataFromPropertyFile("url");
		String email = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Login_Sheet_Name, 1, 0);
		String password = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Login_Sheet_Name, 1, 1);
		String homePageTitle = eUtils.fetchStringDataFromExcelSheet(IPathConstant.Login_Sheet_Name, 1, 2);

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		System.out.println("The Browser is launched");
		wUtils.maximizeTheWindow(driver);
		wUtils.waitForElementsToLoaded(driver);
		driver.get(url);
		System.out.println("The URL is Navigated");

		LandingPage land = new LandingPage(driver);
		LoginPage login = new LoginPage(driver);

		land.clickOnLoginButton();
		login.loginAction(email, password);

		wUtils.waitForTitle(driver, homePageTitle);

		Assert.assertTrue(driver.getTitle().contains(homePageTitle));
		System.out.println("The user has logged in");
		Thread.sleep(3000);

	}


	@AfterClass
	public void teardown() {
		HomePage home = new HomePage(driver);

		home.logoutAction();
		System.out.println("The user has logged out");
		driver.quit();
	}

}
