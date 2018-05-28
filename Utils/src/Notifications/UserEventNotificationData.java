package Notifications;

import Enums.NotificationType;
import ResponsesEntitys.EventData;
import ResponsesEntitys.UserData;

public class UserEventNotificationData extends EventNotificationData {

	private UserData userData;

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public UserEventNotificationData(NotificationType notificationType, EventData eventData, UserData userData) {
		super(notificationType, eventData);
		this.userData = userData;
	}


}
