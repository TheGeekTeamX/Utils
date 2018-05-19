package Responses;

import java.util.LinkedList;
import java.util.List;

import Enums.ResponseType;
import ResponsesEntitys.EventData;

public class EventsListResponseData extends ResponseData {
	private List<EventData> events;

	public List<EventData> getEvents() {
		return events;
	}

	public void setEvents(List<EventData> events) {
		this.events = events;
	}

	public EventsListResponseData(List<EventData> events) {
		super(ResponseType.Events);
		this.events = events;
	}
	
	

}
