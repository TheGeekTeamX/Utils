package ResponsesEntitys;

public class UserData{
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private float lengthOfRecord;
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public float getLengthOfRecord() {
		return lengthOfRecord;
	}
	public void setLengthOfRecord(float lengthOfRecord) {
		this.lengthOfRecord = lengthOfRecord;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public UserData(int id,String firstName, String lastName, String email,String phoneNumber,float lengthOfRecord) {
		super();
		this.userId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.lengthOfRecord = lengthOfRecord;
	}
	
    @Override
    public String toString() {
        return "Event{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
	

	

}
