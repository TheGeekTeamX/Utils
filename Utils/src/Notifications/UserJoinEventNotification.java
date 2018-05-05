package Notifications;

import Enums.NotificationType;

public class UserJoinEventNotification extends UserEventNotificationData {


	public UserJoinEventNotification(int eventId, int userId) {
		super(NotificationType.UserJoinEvent, eventId, userId);
	}
	
	

}
