package request;

public class CreateUserRequestData extends RequestData {
	
	private int id;
	private String firstName;
	private String lastName;
	private String lastLogin;
	private String phoneNumber;
	private String email;
	private String friendsIds;
	private String eventsIds;
	private String pictureUrl;
	private boolean admin = false;
	private long lastUpdated;

	public CreateUserRequestData() {
		super();
	}

	public CreateUserRequestData(int id,String firstName, String lastName, String lastLogin, String phoneNumber,
			String email, String friendsIds, String eventsIds, String pictureUrl, boolean admin, long lastUpdated) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastLogin = lastLogin;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.friendsIds = friendsIds;
		this.eventsIds = eventsIds;
		this.pictureUrl = pictureUrl;
		this.admin = admin;
		this.lastUpdated = lastUpdated;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFriendsIds() {
		return friendsIds;
	}

	public void setFriendsIds(String friendsIds) {
		this.friendsIds = friendsIds;
	}

	public String getEventsIds() {
		return eventsIds;
	}

	public void setEventsIds(String eventsIds) {
		this.eventsIds = eventsIds;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public long getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(long lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
