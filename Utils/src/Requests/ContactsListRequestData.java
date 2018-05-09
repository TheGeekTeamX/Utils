package Requests;

import Enums.RequestType;

public class ContactsListRequestData extends RequestData{

	public ContactsListRequestData(String userEmail) {
		super(RequestType.ContactsListRequest, userEmail);
		// TODO Auto-generated constructor stub
	}
	

}
