package users;

import java.sql.Date;

import Enums.Degree;
import Enums.Faculty;

import other.Complaint;

public class DinOfficeManager extends Manager {
    Faculty faculty;

    public DinOfficeManager(String id, String name, double salary, Faculty faculty, String password) {
        super(id, name, salary, password);
        this.faculty = faculty;
    }

    public void viewComplaints() {
    	System.out.println(Data.getInstance().getComplaints());
    }

    public void addComplaint(Complaint complaint) {
        Data.getInstance().getComplaints().add(complaint);
    }
    
}
