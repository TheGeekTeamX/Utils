package Responses;

import Enums.ResponseType;

public class BooleanResponseData extends ResponseData{
	private Boolean flag;

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public BooleanResponseData(Boolean flag) {
		super(ResponseType.Boolean);
		this.flag = flag;
	}
	
	

}
