package Responses;

import Enums.ResponseType;

public class ResponseData {
	private ResponseType type;

	public ResponseType getType() {
		return type;
	}

	public void setType(ResponseType type) {
		this.type = type;
	}

	public ResponseData(ResponseType type) {
		super();
		this.type = type;
	}
	
	

}
