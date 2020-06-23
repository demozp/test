package com.list;

public class UserInfo {
	private String userName;
	private String userPwd;
	//set 和get
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	//构造方法
	public UserInfo(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}
	public UserInfo() {
		super();
	}
	
	
	
	
}
