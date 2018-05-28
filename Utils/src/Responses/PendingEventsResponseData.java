package Responses;

import java.util.List;

import Enums.ResponseType;
import ResponsesEntitys.EventData;

public class PendingEventsResponseData extends ResponseData{

	private List<EventData> events;

	public List<EventData> getEvents() {
		return events;
	}

	public void setEvents(List<EventData> events) {
		this.events = events;
	}

	public PendingEventsResponseData(List<EventData> events) {
		super(ResponseType.PendingEvents);
		this.events = events;
	}
	
	
}
