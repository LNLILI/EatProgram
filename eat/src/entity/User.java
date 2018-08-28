package entity;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = -8842200095476581791L;
	
	private String Username;
	private String password;
	private String Realpassword;
	private String Realname;
	private String Gender;
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealpassword() {
		return Realpassword;
	}
	public void setRealpassword(String realpassword) {
		Realpassword = realpassword;
	}
	public String getRealname() {
		return Realname;
	}
	public void setRealname(String realname) {
		Realname = realname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	
}