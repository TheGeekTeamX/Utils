package Requests;

import Enums.RequestType;

public class EditUserRequestData extends RequestData {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String country;
	private String pictureUrl;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public EditUserRequestData(String userEmail, String firstName, String lastName,String phoneNumber, String country, String pictureUrl) {
		super(RequestType.EditUserRequest, userEmail);
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.pictureUrl = pictureUrl;
	}
	
	
	
	
}
