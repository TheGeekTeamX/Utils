package Requests;

import Enums.RequestType;

public class UpdateProfilePictureRequestData extends RequestData {
	private String newProfilePictureUrl;

	
	public UpdateProfilePictureRequestData(String userEmail) {
		super(RequestType.UpdateProfilePictureRequest, userEmail);
		// TODO Auto-generated constructor stub
	}

	public UpdateProfilePictureRequestData(String userEmail, String newProfilePictureUrl) {
		super(RequestType.UpdateProfilePictureRequest, userEmail);
		this.newProfilePictureUrl = newProfilePictureUrl;
	}

	public String getNewProfilePictureUrl() {
		return this.newProfilePictureUrl;
	}

	public void setNewProfilePictureUrl(String newProfilePictureUrl) {
		this.newProfilePictureUrl = newProfilePictureUrl;
	}
	

}
