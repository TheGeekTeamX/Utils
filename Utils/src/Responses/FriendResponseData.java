package Responses;

import Enums.ResponseType;
import ResponsesEntitys.UserData;

public class FriendResponseData extends ResponseData {

	private UserData userData;

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public FriendResponseData(ResponseType type, UserData userData) {
		super(type);
		this.userData = userData;
	}

	


	

}
