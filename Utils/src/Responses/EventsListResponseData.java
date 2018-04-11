package Responses;

import java.util.LinkedList;

import Enums.ResponseType;
import ResponsesEntitys.EventData;

public class EventsListResponseData extends ResponseData {
	private LinkedList<EventData> events;

	public LinkedList<EventData> getEvents() {
		return events;
	}

	public void setEvents(LinkedList<EventData> events) {
		this.events = events;
	}

	public EventsListResponseData(LinkedList<EventData> events) {
		super(ResponseType.Events);
		this.events = events;
	}
	
	

}
