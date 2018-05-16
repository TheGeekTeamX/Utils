package Responses;

import Enums.ResponseType;

public class EventProtocolResponseData extends ResponseData {
	private String[] fileBytes;

	public String[] getFileBytes() {
		return fileBytes;
	}

	public void setFileBytes(String[] fileBytes) {
		this.fileBytes = fileBytes;
	}

	public EventProtocolResponseData(String[] fileBytes) {
		super(ResponseType.EventProtocolResponse);
		this.fileBytes = fileBytes;
	}
	
	

}
