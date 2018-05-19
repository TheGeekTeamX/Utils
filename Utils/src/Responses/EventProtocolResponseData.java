package Responses;

import java.util.List;

import Enums.ResponseType;
import ResponsesEntitys.ProtocolLine;

public class EventProtocolResponseData extends ResponseData {
	private int eventId;
	private List<ProtocolLine> protocolLines;

	public List<ProtocolLine> getProtocolLines() {
		return protocolLines;
	}

	public void setProtocolLines(List<ProtocolLine> protocolLines) {
		this.protocolLines = protocolLines;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public EventProtocolResponseData(int eventId,List<ProtocolLine> protocolLines) {
		super(ResponseType.EventProtocolResponse);
		this.eventId = eventId;
		this.protocolLines = protocolLines;
	}
	
	

	
	

}
