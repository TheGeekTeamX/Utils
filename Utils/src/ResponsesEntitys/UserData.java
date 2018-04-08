package ResponsesEntitys;

public class UserData {
	private String fullName;
	private String email;
	private String pictureURL;
	
	
	public UserData(String fullName, String email, String pictureURL) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.pictureURL = pictureURL;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPictureURL() {
		return pictureURL;
	}
	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}
	

}
