package Responses;

import Enums.ErrorType;
import Enums.ResponseType;

public class ErrorResponseData extends ResponseData{
	private ErrorType errorType;

	public ErrorType getErrorType() {
		return errorType;
	}

	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}

	public ErrorResponseData(ErrorType errorType) {
		super(ResponseType.Error);
		this.errorType = errorType;
	}
	
	

}
