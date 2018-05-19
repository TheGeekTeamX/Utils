package UpdateObjects;

import java.util.List;

public class EventInvite {
	private int id;
	private String title;
	private List<String> participants;
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
	public List<String> getParticipants() {
		return participants;
	}
	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}
	public EventInvite(int id, String title, List<String> participants) {
		super();
		this.id = id;
		this.title = title;
		this.participants = participants;
	}
	
	

}
