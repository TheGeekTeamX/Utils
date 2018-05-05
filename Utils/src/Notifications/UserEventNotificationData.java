package Notifications;

import Enums.NotificationType;

public class UserEventNotificationData extends EventNotificationData {

	private int userId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public UserEventNotificationData(NotificationType notificationType, int eventId, int userId) {
		super(notificationType, eventId);
		this.userId = userId;
	}


}
