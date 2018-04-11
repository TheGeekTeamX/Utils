package Responses;

import java.util.LinkedList;

import Enums.ResponseType;
import ResponsesEntitys.UserData;

public class ContactsListResponseData extends ResponseData {
	private LinkedList<UserData> contacts;

	public LinkedList<UserData> getContacts() {
		return contacts;
	}

	public void setContacts(LinkedList<UserData> contacts) {
		this.contacts = contacts;
	}

	public ContactsListResponseData(LinkedList<UserData> contacts) {
		super(ResponseType.Contacts);
		this.contacts = contacts;
	}
	
	

}
