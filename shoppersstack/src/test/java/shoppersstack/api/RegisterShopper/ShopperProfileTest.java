package shoppersstack.api.RegisterShopper;

import org.testng.annotations.Test;

import genericUtils.BaseApiClass;
import io.restassured.response.Response;
import shoppersstack.endpoints.ShopperProfileEndpoints;

public class ShopperProfileTest extends BaseApiClass {
	String userId;
	String token;

	@Test(priority = 1)
	public void registerShopper() {
		System.out.println(shopper);
		Response response = ShopperProfileEndpoints.registerShopper(shopper);

		userId = response.jsonPath().getString("data.userId");

		response.then().statusCode(201).log().all();
		System.out.println("API for regiter shopper is verified");
	}

	@Test(priority = 2)
	public void loginShopper() {
		Response response = ShopperProfileEndpoints.shopperLogin(login);

		token = response.jsonPath().getString("data.jwtToken");

		response.then().statusCode(200).log().all();
		System.out.println("API for Login shopper is verified");
	}

	@Test(priority = 3)
	public void findShopperDataByShopperID() {

		ShopperProfileEndpoints.findShopperData(userId, token)

				.then().statusCode(200).log().all();
		System.out.println("API for find shopper data by Shopper Id is verified");
	}

}
