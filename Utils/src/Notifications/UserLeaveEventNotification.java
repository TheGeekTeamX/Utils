package Notifications;

import Enums.NotificationType;
import ResponsesEntitys.EventData;
import ResponsesEntitys.UserData;

public class UserLeaveEventNotification extends UserEventNotificationData {

	public UserLeaveEventNotification(EventData eventData, UserData userData) {
		super(NotificationType.UserLeaveEvent, eventData,userData);
		// TODO Auto-generated constructor stub
	}

}
