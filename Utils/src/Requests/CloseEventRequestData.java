package Requests;

import Enums.RequestType;

public class CloseEventRequestData extends RequestData {
	private int eventId;
	private String[] recordsBytes;

	public CloseEventRequestData(String userEmail, int eventId,String[] recordsBytes) {
		super(RequestType.CloseEventRequest, userEmail);
		this.eventId = eventId;
		this.recordsBytes=recordsBytes;
	}


	public int getEventId() {
		return this.eventId;
	}

	public void setEventId(int id) {
		this.eventId = id;
	}


	public String[] getRecordsBytes() {
		return recordsBytes;
	}


	public void setRecordsBytes(String[] recordsBytes) {
		this.recordsBytes = recordsBytes;
	}
	
	
}
