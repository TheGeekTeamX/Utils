package Requests;

import Enums.RequestType;

public class JoinEventRequestData extends RequestData {

	private int eventId;
	
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public JoinEventRequestData(String userEmail, int eventId) {
		super(RequestType.JoinEvent, userEmail);
		this.eventId = eventId;
	}

	

}
