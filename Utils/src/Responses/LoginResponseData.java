package Responses;

import Enums.ResponseType;
import ResponsesEntitys.UserData;

public class LoginResponseData extends ResponseData {
	private UserData userData;

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public LoginResponseData(UserData userData) {
		super(ResponseType.Login);
		this.userData = userData;
	}
	
	



}
