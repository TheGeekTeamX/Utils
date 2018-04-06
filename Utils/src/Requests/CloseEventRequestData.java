package Requests;

import Enums.RequestType;

public class CloseEventRequestData extends RequestData {
	private int eventId;

	public CloseEventRequestData(String userEmail, int eventId) {
		super(RequestType.CloseEventRequest, userEmail);
		this.eventId = eventId;
	}

	
	public CloseEventRequestData(String userEmail) {
		super(RequestType.CloseEventRequest,userEmail);
		// TODO Auto-generated constructor stub
		this.eventId = -1;
	}


	public int getEventId() {
		return this.eventId;
	}

	public void setEventId(int id) {
		this.eventId = id;
	}
	
}
