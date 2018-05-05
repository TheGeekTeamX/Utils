package Requests;

import Enums.RequestType;

public class UpdateProfilePictureRequestData extends RequestData {
	private String newProfilePictureUrl;

	

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
