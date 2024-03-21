package shoppersstack.endpoints;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import shoppersstack.pojo.LoginRequest;
import shoppersstack.pojo.Shopper;
import shoppersstack.routes.ShopperProfileRoutes;

public class ShopperProfileEndpoints {

	public static Response registerShopper(Shopper shopper) {

		return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(shopper)

				.when().post(ShopperProfileRoutes.register_shopper_url);
	}

	public static Response findShopperData(String shopperId, String token) {

		return given().pathParam("shopperId", shopperId).auth().oauth2(token)
				
				.when().get(ShopperProfileRoutes.find_shopper_by_shopperID_url);
	}

	public static Response updateShopperDetails(String payload) {

		return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
				.patch(ShopperProfileRoutes.update_shopper_details_url);

	}

	public static Response genaratesURLForForgotPassword(String payload) {

		return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
				.post(ShopperProfileRoutes.forgot_passowrd_url);

	}
	
	public static Response shopperLogin(LoginRequest payload) {

		return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
				.post(ShopperProfileRoutes.shopper_login_url);

	}
	
	public static Response resetPassword(String payload) {

		return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
				.post(ShopperProfileRoutes.reset_password_url);

	}
	
	public static Response setUserPassword(String payload) {

		return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
				.post(ShopperProfileRoutes.set_user_password_url);

	}
	
	

}
