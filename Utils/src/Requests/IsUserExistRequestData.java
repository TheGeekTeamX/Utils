package Requests;

import Enums.RequestType;

public class IsUserExistRequestData extends RequestData {
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public IsUserExistRequestData(String userEmail, String email) {
		super(RequestType.IsUserExistRequest, userEmail);
		this.email = email;
	}
	
	

}
