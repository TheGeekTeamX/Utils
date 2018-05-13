package Responses;

import Enums.ResponseType;
import ResponsesEntitys.UserData;

public class IsUserExistResponseData extends FriendResponseData {

	public IsUserExistResponseData(UserData userData) {
		super(ResponseType.IsUserExistResponse, userData);
		// TODO Auto-generated constructor stub
	}

}
