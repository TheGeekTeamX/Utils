package ResponsesEntitys;

public class UserData {
	private String firstName;
	private String lastName;
	private String email;
	private String pictureURL;
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
	public UserData(String firstName, String lastName, String email, String pictureURL) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pictureURL = pictureURL;
	}
	
	

	

}
