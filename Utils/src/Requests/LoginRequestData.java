package Requests;

import Enums.RequestType;

public class LoginRequestData extends RequestData {
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginRequestData(String userEmail,String password) {
		super(RequestType.LoginRequest, userEmail);
		// TODO Auto-generated constructor stub
		this.password = password;
	}

}
