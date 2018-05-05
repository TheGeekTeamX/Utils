package Notifications;

import Enums.NotificationType;

public class NotificationData {
	private NotificationType notificationType;

	
	public NotificationData(NotificationType notificationType) {
		super();
		this.notificationType = notificationType;
	}

	public NotificationType getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(NotificationType notificationType) {
		this.notificationType = notificationType;
	}
	
	

}
