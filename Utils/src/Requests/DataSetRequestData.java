package Requests;

import Enums.RequestType;

public class DataSetRequestData extends RequestData {
	private byte[] record;

	public byte[] getRecord() {
		return record;
	}

	public void setRecord(byte[] record) {
		this.record = record;
	}

	public DataSetRequestData(String userEmail, byte[] record) {
		super(RequestType.DataSetRequest, userEmail);
		this.record = record;
	}
	
	

}
