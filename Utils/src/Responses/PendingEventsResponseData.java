package Responses;

import java.util.LinkedList;

import Enums.ResponseType;
import ResponsesEntitys.EventData;

public class PendingEventsResponseData extends ResponseData{

	LinkedList<EventData> events;

	public LinkedList<EventData> getEvents() {
		return events;
	}

	public void setEvents(LinkedList<EventData> events) {
		this.events = events;
	}

	public PendingEventsResponseData(LinkedList<EventData> events) {
		super(ResponseType.PendingEvents);
		this.events = events;
	}
	
	
}
