package nuts.about.candies.user;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = -583198955099075128L;

private Integer userID;
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String rePassword;
	
	
	public User(){
		
		this.setUserID(userID);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setPassword(password);
		this.setRePassword(rePassword);
	}
	
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	

}
