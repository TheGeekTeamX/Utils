package request;

public class CloseEventRequestData extends RequestData {
	private int id;

	public CloseEventRequestData(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
