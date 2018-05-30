package Responses;

import Enums.ResponseType;

public class DataSetResponseData extends ResponseData {
	
	private float updatedLength;

	public float getUpdatedLength() {
		return updatedLength;
	}

	public void setUpdatedLength(float updatedLength) {
		this.updatedLength = updatedLength;
	}

	public DataSetResponseData(float updatedLength) {
		super(ResponseType.DataSetResponseData);
		this.updatedLength = updatedLength;
	}
	
	

}
