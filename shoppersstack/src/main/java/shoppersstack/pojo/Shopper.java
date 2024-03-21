package shoppersstack.pojo;

public class Shopper {
	
	private String city;
    private String country;
    private String email;
    private String firstName;
    private Gender gender;
    private String lastName;
    private String password;
    private long phone;
    private String state;
    private ZoneID zoneId;

    // Constructor
    public Shopper() {
    }

    // Getters and Setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ZoneID getZoneId() {
        return zoneId;
    }

    public void setZoneId(ZoneID zoneId) {
        this.zoneId = zoneId;
    }
    
    @Override
    public String toString() {
        return "{" +
                "\"city\": \"" + city + "\"," +
                "\"country\": \"" + country + "\"," +
                "\"email\": \"" + email + "\"," +
                "\"firstName\": \"" + firstName + "\"," +
                "\"gender\": \"" + (gender != null ? gender.name() : "") + "\"," +
                "\"lastName\": \"" + lastName + "\"," +
                "\"password\": \"" + password + "\"," +
                "\"phone\": " + phone + "," +
                "\"state\": \"" + state + "\"," +
                "\"zoneId\": \"" + (zoneId != null ? zoneId.name() : "") + "\"" +
                "}";
    }
    
    public enum Gender {
    	MALE
    }
    
    public enum ZoneID {
    	ALPHA
    }

}
