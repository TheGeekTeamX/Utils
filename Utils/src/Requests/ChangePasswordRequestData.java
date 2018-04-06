package Requests;

import Enums.RequestType;

public class ChangePasswordRequestData extends RequestData {

	private String oldPassword;
	private String newPassword;
	
	
	public ChangePasswordRequestData(String userEmail) {
		super(RequestType.ChangePasswordRequest, userEmail);
		// TODO Auto-generated constructor stub
		this.oldPassword = "";
		this.newPassword = "";
	}
	public ChangePasswordRequestData(String userEmail, String oldPassword, String newPassword) {
		super(RequestType.ChangePasswordRequest, userEmail);
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
	}

	public String getOldPassword() {
		return this.oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return this.newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
}
