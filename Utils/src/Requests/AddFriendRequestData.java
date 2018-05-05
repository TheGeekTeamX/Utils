package Requests;

import Enums.RequestType;

public class AddFriendRequestData extends RequestData {
	private String friendEmail;


	public AddFriendRequestData(String userEmail, String friendMail) {
		super(RequestType.AddFriendRequest, userEmail);
		this.friendEmail = friendMail;
	}


	public String getFriendMail() {
		return this.friendEmail;
	}

	public void setFriendMail(String friendMail) {
		this.friendEmail = friendMail;
	}

}
