package Requests;

import Enums.RequestType;

public class UpdateProfilePictureRequestData extends RequestData {
	private String profilePictureBytes;

	public String getProfilePictureBytes() {
		return profilePictureBytes;
	}

	public void setProfilePictureBytes(String profilePictureBytes) {
		this.profilePictureBytes = profilePictureBytes;
	}

	public UpdateProfilePictureRequestData(String userEmail, String profilePictureBytes) {
		super(RequestType.UpdateProfilePictureRequest, userEmail);
		this.profilePictureBytes = profilePictureBytes;
	}

	


	

}
