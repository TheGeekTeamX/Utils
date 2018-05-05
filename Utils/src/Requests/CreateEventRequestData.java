package Requests;

import Enums.RequestType;

public class CreateEventRequestData extends RequestData {
    private String usersEmails;
    private String title;
    private String description;
    private String dateCreated;

	public CreateEventRequestData(String userEmail,  String usersEmails, String title, String description, String dateCreated) {
		super(RequestType.CreateEventRequest, userEmail);
		this.usersEmails = usersEmails;
		this.title = title;
		this.description = description;
		this.dateCreated = dateCreated;
	}

	public String getUsersEmails() {
		return this.usersEmails;
	}

	public void setUsersEmails(String usersEmails) {
		this.usersEmails = usersEmails;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
    
    
}
