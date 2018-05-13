package Responses;

import java.io.File;

import Enums.ResponseType;

public class ProfilePictureResponseData extends ResponseData {
	
	private byte[] image;

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public ProfilePictureResponseData(byte[] image) {
		super(ResponseType.ProfilePicture);
		this.image = image;
	}
	
	

	
	

}
