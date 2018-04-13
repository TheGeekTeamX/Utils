package Responses;

import Enums.ErrorType;
import Enums.ResponseType;

public class ErrorResponse extends ResponseData{
	private ErrorType errorType;

	public ErrorType getErrorType() {
		return errorType;
	}

	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}

	public ErrorResponse(ErrorType errorType) {
		super(ResponseType.Error);
		this.errorType = errorType;
	}
	
	

}
