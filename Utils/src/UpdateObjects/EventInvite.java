package UpdateObjects;

import java.util.ArrayList;

public class EventInvite {
	private int id;
	private String title;
	private ArrayList<String> participants;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<String> getParticipants() {
		return participants;
	}
	public void setParticipants(ArrayList<String> participants) {
		this.participants = participants;
	}
	public EventInvite(int id, String title, ArrayList<String> participants) {
		super();
		this.id = id;
		this.title = title;
		this.participants = participants;
	}
	
	

}
