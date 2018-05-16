package Requests;

import java.sql.Date;
import java.util.List;

import Enums.RequestType;

public class CreateEventRequestData extends RequestData {
    private List<String> usersEmails;
    private String title;
    private String description;
    private Date dateCreated;

	public CreateEventRequestData(String userEmail,  List<String> usersEmails, String title, String description, Date dateCreated) {
		super(RequestType.CreateEventRequest, userEmail);
		this.usersEmails = usersEmails;
		this.title = title;
		this.description = description;
		this.dateCreated = dateCreated;
	}

	public List<String> getUsersEmails() {
		return this.usersEmails;
	}

	public void setUsersEmails(List<String> usersEmails) {
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

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
    
    
}
