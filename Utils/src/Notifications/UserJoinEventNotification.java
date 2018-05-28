package Notifications;

import Enums.NotificationType;
import ResponsesEntitys.EventData;
import ResponsesEntitys.UserData;

public class UserJoinEventNotification extends UserEventNotificationData {
	public UserJoinEventNotification(EventData eventData, UserData userData) {
		super(NotificationType.UserJoinEvent, eventData, userData);
	}
	
	

}
