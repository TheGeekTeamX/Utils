package Responses;

import Enums.ResponseType;

public class EditResponseData extends ResponseData{
	private Boolean isChanged;

	public Boolean getIsChanged() {
		return isChanged;
	}

	public void setIsChanged(Boolean isChanged) {
		this.isChanged = isChanged;
	}

	public EditResponseData(Boolean isChanged) {
		super(ResponseType.Edit);
		this.isChanged = isChanged;
	}
	
	

}
