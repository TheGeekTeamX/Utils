package Notifications;

import Enums.NotificationType;

public class UserLeaveEventNotification extends UserEventNotificationData {

	public UserLeaveEventNotification(int eventId, int userId) {
		super(NotificationType.UserLeaveEvent, eventId,userId);
		// TODO Auto-generated constructor stub
	}

}
