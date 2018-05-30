package Requests;

import Enums.RequestType;

public class DataSetRequestData extends RequestData {
	private byte[] record;
	private float length;
	
	

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public byte[] getRecord() {
		return record;
	}

	public void setRecord(byte[] record) {
		this.record = record;
	}

	public DataSetRequestData(String userEmail, byte[] record,float length) {
		super(RequestType.DataSetRequest, userEmail);
		this.record = record;
		this.length = length;
	}
	
	

}
