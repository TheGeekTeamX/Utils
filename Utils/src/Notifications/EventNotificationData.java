package Notifications;

import Enums.NotificationType;

public class EventNotificationData extends NotificationData {

	private int eventId;
	
	
	public int getEventId() {
		return eventId;
	}


	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public EventNotificationData(NotificationType notificationType,int eventId) {
		super(notificationType);
		// TODO Auto-generated constructor stub
		this.eventId = eventId;
	}

}
