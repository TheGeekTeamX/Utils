package ResponsesEntitys;

import java.util.List;

public class EventData {
	
	private int id;
	private String title;
	private String dateCreated;
	private List<UserData> participants;
	private Boolean isRecording;
	private Boolean isConverted;
	private String adminMail;
	private String description;
	
	
	
	
	public Boolean getIsRecording() {
		return isRecording;
	}
	public void setIsRecording(Boolean isRecording) {
		this.isRecording = isRecording;
	}
	public Boolean getIsConverted() {
		return isConverted;
	}
	public void setIsConverted(Boolean isConverted) {
		this.isConverted = isConverted;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public EventData(int id, String title, String dateCreated, List<UserData> participants,
			String adminMail, String description, Boolean isRecording , Boolean isConverted) {
		super();
		this.id = id;
		this.title = title;
		this.dateCreated = dateCreated;
		this.participants = participants;
		this.adminMail = adminMail;
		this.description = description;
		this.isRecording = isRecording;
		this.isConverted = isConverted;
	}
	


	
	

}
