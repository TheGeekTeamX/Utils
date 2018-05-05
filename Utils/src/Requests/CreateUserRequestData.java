package Requests;

import Enums.RequestType;

public class CreateUserRequestData extends RequestData {
	
	private String credential;
	private String fullName;
	private String phoneNumber;
	private String country;
	private String pictureUrl;



	public CreateUserRequestData(String userEmail, String credential, String fullName, String phoneNumber,String country, String pictureUrl) {
		super(RequestType.CreateUserRequest, userEmail);
		this.credential = credential;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.pictureUrl = pictureUrl;
	}


	
	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getPictureUrl() {
		return this.pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}


}
