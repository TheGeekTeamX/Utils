package ResponsesEntitys;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

public class EventData implements Serializable{
	
	private int id;
	private String title;
	private Date dateCreated;
	private List<UserData> participants;
	private String recordURL;
	private String adminMail;
	private String description;
	private boolean isRecording;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRecordURL() {
		return recordURL;
	}
	public void setRecordURL(String recordURL) {
		this.recordURL = recordURL;
	}
	public String getAdminMail() {
		return adminMail;
	}
	public void setAdminMail(String adminMail) {
		this.adminMail = adminMail;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isRecording() {
		return isRecording;
	}
	public void setRecording(boolean isRecording) {
		this.isRecording = isRecording;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<UserData> getParticipants() {
		return participants;
	}
	public void setParticipants(List<UserData> participants) {
		this.participants = participants;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public EventData(int id, String title, Date dateCreated, List<UserData> participants, String recordURL,
			String adminMail, String description, boolean isRecording) {
		super();
		this.id = id;
		this.title = title;
		this.dateCreated = dateCreated;
		this.participants = participants;
		this.recordURL = recordURL;
		this.adminMail = adminMail;
		this.description = description;
		this.isRecording = isRecording;
	}
	
    @Override
    public String toString() {
        return "Event{" +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", users='" + participants.toString() + '\'' +
                ", recordURL='" + recordURL + '\'' +
                ", adminMail='" + adminMail + '\'' +
                ", description='" + description + '\'' +
                ", isRecording='" + isRecording + '\'' +
                '}';
    }

	
	

}
