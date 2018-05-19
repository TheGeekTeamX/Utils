package Responses;

import java.util.List;

import Enums.ResponseType;
import ResponsesEntitys.UserData;

public class ContactsListResponseData extends ResponseData {
	private List<UserData> contacts;

	public List<UserData> getContacts() {
		return contacts;
	}

	public void setContacts(List<UserData> contacts) {
		this.contacts = contacts;
	}

	public ContactsListResponseData(List<UserData> contacts) {
		super(ResponseType.Contacts);
		this.contacts = contacts;
	}
	
	

}
