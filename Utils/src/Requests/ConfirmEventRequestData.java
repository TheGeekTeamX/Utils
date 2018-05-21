package Requests;

import Enums.RequestType;

public class ConfirmEventRequestData extends RequestData {

	private int eventId;
	
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public ConfirmEventRequestData(String userEmail, int eventId) {
		super(RequestType.ConfirmEvent, userEmail);
		this.eventId = eventId;
	}

	

}
