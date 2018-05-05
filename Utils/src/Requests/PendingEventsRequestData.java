/**
 * 
 */
package Requests;

import Enums.RequestType;

/**
 * @author Sahar Mizrahi
 *
 */
public class PendingEventsRequestData extends RequestData {

	public PendingEventsRequestData(String userEmail) {
		super(RequestType.PendingEventsRequest, userEmail);
		// TODO Auto-generated constructor stub
	}

}
