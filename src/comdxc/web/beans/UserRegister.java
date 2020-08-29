package comdxc.web.beans;

import java.io.Serializable;

public class UserRegister implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String first_name;
	private String last_name;
	private String username;
	private String password;
	public UserRegister()
	{
		super();
	}
	public UserRegister(String first_name, String last_name, String username, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserRegister [first_name=" + first_name + ", last_name=" + last_name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
}
