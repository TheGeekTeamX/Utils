package Requests;

import java.util.LinkedList;

import Enums.RequestType;

public class EditContactsListRequestData extends RequestData {
	private LinkedList <String> updatedFriendsList;

	public EditContactsListRequestData(String userEmail, LinkedList<String> updatedFriendsList) {
		super(RequestType.EditContactsListRequest, userEmail);
		this.updatedFriendsList = updatedFriendsList;
	}
	
	public EditContactsListRequestData(String userEmail) {
		super(RequestType.EditContactsListRequest, userEmail);
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
