package request;

public class AddFriendRequestData extends RequestData {
	private int id;
	private String friendMail;
	private int friendId;

	public AddFriendRequestData(int id, int friendId) {
		super();
		this.id = id;
		this.friendId = friendId;
	}

	public AddFriendRequestData(int id, String friendMail) {
		super();
		this.id = id;
		this.friendMail = friendMail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFriendMail() {
		return friendMail;
	}

	public void setFriendMail(String friendMail) {
		this.friendMail = friendMail;
	}

	public int getFriendId() {
		return friendId;
	}

	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}

}
