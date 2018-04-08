package Responses;

import Enums.ResponseType;
import ResponsesEntitys.UserData;

public class AddFriendResponseData extends ResponseData{
	private UserData userData;

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public AddFriendResponseData(UserData userData) {
		super(ResponseType.AddFriendResponse);
		this.userData = userData;
	}
	
	

}
