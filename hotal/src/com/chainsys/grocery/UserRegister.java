package com.chainsys.grocery;

public class UserRegister {

	int userid;
	String name;
	String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRegister(int userid, String name, String password) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
	}
	
	public UserRegister() {
		super();
	}
	@Override
	public String toString() {
		return "UserRegistor [userid=" + userid + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
