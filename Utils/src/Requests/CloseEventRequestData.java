package Requests;

import Enums.RequestType;

public class CloseEventRequestData extends RequestData {
	private int eventId;

	public CloseEventRequestData(String userEmail, int eventId) {
		super(RequestType.CloseEventRequest, userEmail);
		this.eventId = eventId;
	}


	public int getEventId() {
		return this.eventId;
	}

	public void setEventId(int id) {
		this.eventId = id;
	}
	
}
