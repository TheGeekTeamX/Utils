package Requests;

import Enums.RequestType;

public class LoginRequestData extends RequestData {
	private String password;

	public LoginRequestData(String userEmail, String password) {
		// TODO Auto-generated constructor stub
		super(RequestType.LoginRequest, userEmail);
		this.password = password;
	}
	
	
	public LoginRequestData(String userEmail) {
		super(RequestType.LoginRequest, userEmail);
		// TODO Auto-generated constructor stub
		this.password = "";
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
