package Requests;

import Enums.RequestType;

public class UpdateProfilePictureRequestData extends RequestData {
	private byte[] profilePictureBytes;

	public byte[] getProfilePictureBytes() {
		return profilePictureBytes;
	}

	public void setProfilePictureBytes(byte[] profilePictureBytes) {
		this.profilePictureBytes = profilePictureBytes;
	}

	public UpdateProfilePictureRequestData(String userEmail, byte[] profilePictureBytes) {
		super(RequestType.UpdateProfilePictureRequest, userEmail);
		this.profilePictureBytes = profilePictureBytes;
	}

	


	

}
