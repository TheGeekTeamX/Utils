package Responses;

import Enums.ResponseType;

public class ErrorResponse extends ResponseData{
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ErrorResponse(String description) {
		super(ResponseType.Error);
		this.description = description;
	}
	
	

}
