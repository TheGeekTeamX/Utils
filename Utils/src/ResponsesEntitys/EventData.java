package ResponsesEntitys;

import java.sql.Date;
import java.util.LinkedList;

public class EventData {
	
	private int id;
	private LinkedList<String> participantsNames;
	private Date dateCreated;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LinkedList<String> getParticipantsNames() {
		return participantsNames;
	}
	public void setParticipantsNames(LinkedList<String> participantsNames) {
		this.participantsNames = participantsNames;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public EventData(int id, LinkedList<String> participantsNames, Date dateCreated) {
		super();
		this.id = id;
		this.participantsNames = participantsNames;
		this.dateCreated = dateCreated;
	}
	
	

}
