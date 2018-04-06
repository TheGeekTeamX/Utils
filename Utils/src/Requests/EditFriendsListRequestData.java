package Requests;

import java.util.LinkedList;

import Enums.RequestType;

public class EditFriendsListRequestData extends RequestData {
	private LinkedList <String> updatedFriendsList;

	public EditFriendsListRequestData(String userEmail, LinkedList<String> updatedFriendsList) {
		super(RequestType.EditFriendsListRequest, userEmail);
		this.updatedFriendsList = updatedFriendsList;
	}
	
	public EditFriendsListRequestData(String userEmail) {
		super(RequestType.EditFriendsListRequest, userEmail);
		// TODO Auto-generated constructor stub
		this.updatedFriendsList = new LinkedList<>();
	}
	public LinkedList<String> getUpdatedFriendsList() {
		return this.updatedFriendsList;
	}

	public void setUpdatedFriendsList(LinkedList<String> updatedFriendsList) {
		this.updatedFriendsList = updatedFriendsList;
	}

	
	

}
