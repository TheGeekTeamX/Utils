package test;

import Enums.RequestType;
import request.LoginRequestData;
import request.RequestData;

public class Run {

	public static void main(String[] args) {
		RequestData rd = new LoginRequestData(11,"1234@wsadsa5");
		rd.setType(RequestType.RecordSending);
		System.out.println(rd.getType());
	}

}
