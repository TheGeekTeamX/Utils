package Requests;

import Enums.RequestType;

public class RequestData {
	private RequestType type;
	private String userEmail;

	public RequestData(RequestType type, String userEmail)
	{
		this.type = type;
		this.userEmail = userEmail;
	}
	
	public RequestType getType() {
		return type;
	}


	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setType(RequestType type) {
		this.type = type;
	}
	

}
