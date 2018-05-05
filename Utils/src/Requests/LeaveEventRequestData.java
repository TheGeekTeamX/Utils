package Requests;

import Enums.RequestType;

public class LeaveEventRequestData extends RequestData {
	private int eventId;

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public LeaveEventRequestData(String userEmail, int eventId) {
		super(RequestType.LeaveEvent, userEmail);
		this.eventId = eventId;
	}
	
	

}
