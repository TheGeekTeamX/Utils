package Notifications;

import java.util.ArrayList;
import Enums.NotificationType;
import ResponsesEntitys.EventData;
import ResponsesEntitys.UserData;

public class EventInvitationNotificationData extends EventNotificationData {
		private EventData eventData;

		public EventData getEventData() {
			return eventData;
		}

		public void setEventData(EventData eventData) {
			this.eventData = eventData;
		}

		public EventInvitationNotificationData(EventData eventData) {
			super(NotificationType.EventInvitation,eventData.getId());
			this.eventData = eventData;
		}
		
		
	

	
	

	


}
