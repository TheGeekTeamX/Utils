package Notifications;

import Enums.NotificationType;
import ResponsesEntitys.EventData;

public class EventCloseNotificationData extends EventNotificationData {

	public EventCloseNotificationData(EventData eventData) {
		super(NotificationType.EventClosed, eventData);
		// TODO Auto-generated constructor stub
	}

}
