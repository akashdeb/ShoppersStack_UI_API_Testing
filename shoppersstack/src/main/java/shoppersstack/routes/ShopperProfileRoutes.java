package shoppersstack.routes;

public class ShopperProfileRoutes {
	
	public static String base_url = "https://www.shoppersstack.com/shopping";
	
	public static String register_shopper_url = base_url+"/shoppers";
	public static String find_shopper_by_shopperID_url = base_url+"/shoppers/{shopperId}";
	public static String update_shopper_details_url = base_url+"/shoppers/{shopperId}";
	public static String forgot_passowrd_url = base_url+"/users/forgot-password";
	public static String shopper_login_url = base_url+"/users/login";
	public static String reset_password_url = base_url+"/users/reset-password";
	public static String set_user_password_url = base_url+"/users/verify-account";

	
	

}
