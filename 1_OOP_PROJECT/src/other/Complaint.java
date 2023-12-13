package other;

public class Complaint {
    private String studentId;
    private UrgencyLevel urgency;
    private String text;

    public Complaint(String studentId, UrgencyLevel urgency , String text) {
        this.studentId = studentId;
        this.urgency = urgency;
        this.text = text;
    }

	public String getStudentId() {
		return studentId;
	}

	public UrgencyLevel getUrgency() {
		return urgency;
	}
	
	public String getText() {
		return text;
	}
    
    

}
