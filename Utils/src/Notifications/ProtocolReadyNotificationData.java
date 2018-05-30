package Notifications;

import Enums.NotificationType;
import ResponsesEntitys.EventData;

public class ProtocolReadyNotificationData extends EventNotificationData {

	public ProtocolReadyNotificationData(EventData eventData) {
		super(NotificationType.ProtocolIsReady, eventData);
		// TODO Auto-generated constructor stub
	}
	

}
