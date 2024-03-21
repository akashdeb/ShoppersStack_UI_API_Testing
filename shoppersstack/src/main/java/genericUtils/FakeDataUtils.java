package genericUtils;

import com.github.javafaker.Faker;

public class FakeDataUtils {
	
	public String generateEmail() {
		Faker fake = new Faker();
		
		return fake.internet().emailAddress();
	}

}
