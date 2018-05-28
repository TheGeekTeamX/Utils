package Notifications;

import Enums.NotificationType;
import ResponsesEntitys.EventData;

public class EventNotificationData extends NotificationData {

	private EventData eventData;
	
	
	public EventData getEventData() {
		return eventData;
	}


	public void setEventData(EventData eventData) {
		this.eventData = eventData;
	}

	public EventNotificationData(NotificationType notificationType,EventData eventData) {
		super(notificationType);
		// TODO Auto-generated constructor stub
		this.eventData = eventData;
	}

}
