package genericUtils;

import org.testng.annotations.BeforeClass;

import com.github.javafaker.Faker;

import shoppersstack.pojo.LoginRequest;
import shoppersstack.pojo.Shopper;

public class BaseApiClass {
	public Faker fake=new Faker();
	public Shopper shopper=new Shopper();
	public LoginRequest login = new LoginRequest();

	@BeforeClass
	public void payloadSetUp() {
		
		shopper.setCity(fake.address().cityName());
		shopper.setCountry(fake.address().country());
		shopper.setEmail(fake.internet().emailAddress());
		shopper.setFirstName(fake.name().firstName());
		shopper.setGender(Shopper.Gender.MALE);
		shopper.setLastName(fake.name().lastName());
		shopper.setPassword(fake.internet().password());
		shopper.setPhone(7889907891L);
		shopper.setState(fake.address().state());
		shopper.setZoneId(Shopper.ZoneID.ALPHA);
		
		login.setEmail(shopper.getEmail());
		login.setPassword(shopper.getPassword());
		login.setRole("SHOPPER");
		
	}

}
