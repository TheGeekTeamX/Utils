package request;

public class LoginRequestData extends RequestData {
	private int id;
	private String password;

	public LoginRequestData(int id, String password) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
