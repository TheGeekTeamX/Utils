package Requests;

import Enums.RequestType;

public class DeclineEventRequestData extends RequestData {
	private int eventId;

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public DeclineEventRequestData(String userEmail, int eventId) {
		super(RequestType.DeclineEvent, userEmail);
		this.eventId = eventId;
	}
	

}
