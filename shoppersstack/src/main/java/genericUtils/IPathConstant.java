package genericUtils;

public interface IPathConstant {
	
	String PROPERTY_FILE_PATH = "./src/test/resources/testData/propertyData.properties";
	String EXCEL_FILE_PATH = "./src/test/resources/testData/ShopperData.xlsx";
	
	String SCREENSHOT_FILE_PATH = "./src/test/resources/screenshots/";
	
	String Create_Account_Sheet_Name = "createProfile";
	String Login_Sheet_Name = "login";
	String Tshirt_Sheet_Name = "tshirts";
	String home_Sheet_Name = "home";
	String Women_Kurti_Sheet_Name = "Women-Kurti";
	String Men_Shirts_Sheet_Name= "Men-Shirts";


	int IMPLICIT_WAIT = 60;
	int EXPLICIT_WAIT = 60;
	
	String JAVASCRIPT_COMMAND_FOR_CLICK = "arguments[0].click()";
	
	String DATA_BASE_URL = "jdbc:mysql://localhost:3306/vtiger2";
	String DATA_BASE_USERNAME = "root";
	String DATA_BASE_PASSWORD = "root";

	

}
