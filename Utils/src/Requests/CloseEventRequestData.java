package Requests;

import Enums.RequestType;

public class CloseEventRequestData extends RequestData {
	private int eventId;
	private byte[] recordsBytes;

	public CloseEventRequestData(String userEmail, int eventId,byte[] recordsBytes) {
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


	public byte[] getRecordsBytes() {
		return recordsBytes;
	}


	public void setRecordsBytes(byte[] recordsBytes) {
		this.recordsBytes = recordsBytes;
	}
	
	
}
