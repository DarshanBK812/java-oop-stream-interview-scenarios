package Student_Management_System;

public class Student {

	private String studentName;
	private int studentRollNumber;
	private int stduentMarks;

	public Student(String name, int rollNumber, int marks) {
		studentName = name;
		studentRollNumber = rollNumber;
		stduentMarks = marks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public int getStduentMarks() {
		return stduentMarks;
	}

	public void setStduentMarks(int stduentMarks) {
		this.stduentMarks = stduentMarks;
	}

}
