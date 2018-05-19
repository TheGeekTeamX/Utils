package Requests;

import java.util.List;

import Enums.RequestType;

public class EditContactsListRequestData extends RequestData {
	private List <String> updatedFriendsList;

	public EditContactsListRequestData(String userEmail, List<String> updatedFriendsList) {
		super(RequestType.EditContactsListRequest, userEmail);
		this.updatedFriendsList = updatedFriendsList;
	}
	
	public List<String> getUpdatedFriendsList() {
		return this.updatedFriendsList;
	}

	public void setUpdatedFriendsList(List<String> updatedFriendsList) {
		this.updatedFriendsList = updatedFriendsList;
	}

	
	

}
