package Requests;

import Enums.RequestType;

public class CreateUserRequestData extends RequestData {
	
	private String credential;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String country;
	private byte[] imageBytes;
	
	public CreateUserRequestData(String userEmail, String credential, String firstName,String lastName, String phoneNumber, String country, byte[] imageBytes) {
		super(RequestType.CreateUserRequest, userEmail);
		this.credential = credential;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.imageBytes = imageBytes;
	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}

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

	public byte[] getImageBytes() {
		return imageBytes;
	}

	public void setImageBytes(byte[] imageBytes) {
		this.imageBytes = imageBytes;
	}
	
	





}
