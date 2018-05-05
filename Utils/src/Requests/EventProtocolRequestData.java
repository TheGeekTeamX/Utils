package Requests;

import Enums.RequestType;

public class EventProtocolRequestData extends RequestData{
	private int eventID;
	

	public int getEventID() {
		return eventID;
	}


	public void setEventID(int eventID) {
		this.eventID = eventID;
	}


	public EventProtocolRequestData(String userEmail,int eventID) {
		super(RequestType.EventProtocolRequest, userEmail);
		// TODO Auto-generated constructor stub
		this.eventID = eventID;
	}
	
	

}
