package other;

import users.Student;

public class Grade {
    private Student student;
    private Course course;
    private double attestation1;
    private double attestation2;
    private double finalExam;
    private String gradeChar;
    private double grade;
    private double gpa;

    public Grade(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getAttestation1() {
		return attestation1;
	}

	public void setAttestation1(double attestation1) {
		this.attestation1 = attestation1;
	}

	public double getAttestation2() {
		return attestation2;
	}

	public void setAttestation2(double attestation2) {
		this.attestation2 = attestation2;
	}

	public double getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(double finalExam) {
		this.finalExam = finalExam;
	}

	public String getGradeChar() {
		return gradeChar;
	}

	public void setGradeChar() {
		if (grade >= 95) {
		    gradeChar = "A";
		} else if (grade >= 90) {
		    gradeChar = "A-";
		} else if (grade >= 85) {
		    gradeChar = "B+";
		} else if (grade >= 80) {
		    gradeChar = "B";
		} else if (grade >= 75) {
		    gradeChar = "B-";
		} else if (grade >= 70) {
		    gradeChar = "C+";
		} else if (grade >= 65) {
		    gradeChar = "C";
		} else if (grade >= 60) {
		    gradeChar = "C-";
		} else if (grade >= 55) {
		    gradeChar = "D+";
		} else if (grade >= 50) {
		    gradeChar = "D";
		} else {
		    gradeChar = "F";
		}

	}

	public double getGrade() {
		return grade;
	}

	public void setGrade() {
		grade = attestation1 + attestation2 + finalExam;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa() {
		this.gpa = grade / 100;
	}
	
}