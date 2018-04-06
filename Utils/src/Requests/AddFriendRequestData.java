package Requests;

import Enums.RequestType;

public class AddFriendRequestData extends RequestData {
	private String friendEmail;


	public AddFriendRequestData(String userEmail, String friendMail) {
		super(RequestType.AddFriendRequest, userEmail);
		this.friendEmail = friendMail;
	}

	public AddFriendRequestData(String userEmail) {
		super(RequestType.AddFriendRequest, userEmail);
		// TODO Auto-generated constructor stub
		this.friendEmail = "";
	}

	public String getFriendMail() {
		return this.friendEmail;
	}

	public void setFriendMail(String friendMail) {
		this.friendEmail = friendMail;
	}

}
