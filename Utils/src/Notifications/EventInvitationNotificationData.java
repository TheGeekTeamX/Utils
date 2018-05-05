package Notifications;

import java.util.ArrayList;
import Enums.NotificationType;

public class EventInvitationNotificationData extends EventNotificationData {

	private ArrayList<String> participantsNames;
	private String title;
	
	public EventInvitationNotificationData(int eventId, ArrayList<String> participantsIds,	String title)
	{
		super(NotificationType.EventInvitation,eventId);
		this.participantsNames = participantsIds;
		this.title = title;
	}


	public ArrayList<String> getParticipantsIds() {
		return participantsNames;
	}

	public void setParticipantsIds(ArrayList<String> participantsIds) {
		this.participantsNames = participantsIds;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

	


}
