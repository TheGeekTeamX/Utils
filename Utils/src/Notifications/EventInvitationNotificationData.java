package Notifications;

import java.util.ArrayList;
import Enums.NotificationType;
import ResponsesEntitys.UserData;

public class EventInvitationNotificationData extends EventNotificationData {

	private ArrayList<UserData> participants;
	private String title;
	
	public EventInvitationNotificationData(int eventId, ArrayList<UserData> participants,	String title)
	{
		super(NotificationType.EventInvitation,eventId);
		this.participants = participants;
		this.title = title;
	}


	public ArrayList<UserData> getParticipants() {
		return participants;
	}

	public void setParticipants(ArrayList<UserData> participants) {
		this.participants = participants;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

	


}
