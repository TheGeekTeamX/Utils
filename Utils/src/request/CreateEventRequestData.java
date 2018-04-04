package request;

public class CreateEventRequestData extends RequestData {
	
    private int id;
    private String title;
    private String content;
    private String date;
    private String usersIds;
    private String recordURL;
    private String adminId;
    private String description;
    private String EventStartTime;
    private boolean isRecording;

    public CreateEventRequestData(){
        this.id = 0;
        this.title = "";
        this.content = "";
        this.date = "";
        this.usersIds = "";
        this.recordURL = "";
        this.adminId = "";
        this.description = "";
        this.EventStartTime = "";
        this.isRecording = true;
    }

	public CreateEventRequestData(int id, String title, String content, String date, String usersIds, String recordURL,
			String adminId, String description, String eventStartTime, boolean isRecording) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.date = date;
		this.usersIds = usersIds;
		this.recordURL = recordURL;
		this.adminId = adminId;
		this.description = description;
		EventStartTime = eventStartTime;
		this.isRecording = isRecording;
	}
    
    
}
