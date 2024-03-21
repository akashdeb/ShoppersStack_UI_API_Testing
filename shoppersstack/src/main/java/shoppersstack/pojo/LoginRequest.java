package shoppersstack.pojo;
	
	public class LoginRequest {
		
	    private String email;
	    private String password;
	    private String role;

	    // Constructor
	    public LoginRequest() {
	    }

	    // Getters and Setters
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getRole() {
	        return role;
	    }

	    public void setRole(String role) {
	        this.role = role;
	    }

	    // toString() method (optional)
	    @Override
	    public String toString() {
	        return "{" +
	                "email='" + email + '\'' +
	                ", password='" + password + '\'' +
	                ", role='" + role + '\'' +
	                '}';
	    }
	}


