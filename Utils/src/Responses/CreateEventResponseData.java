package Responses;

import Enums.ResponseType;

public class CreateEventResponseData extends ResponseData {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CreateEventResponseData(int id) {
		super(ResponseType.CreateEvent);
		this.id = id;
	}
	
	

}
