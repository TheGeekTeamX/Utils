package Notifications;

import Enums.NotificationType;

public class EventCloseNotificationData extends EventNotificationData {

	public EventCloseNotificationData(int eventId) {
		super(NotificationType.EventClosed, eventId);
		// TODO Auto-generated constructor stub
	}

}
