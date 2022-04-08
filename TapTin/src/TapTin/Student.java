package TapTin;

import java.util.Scanner;

public class Student extends Person{
	String name;
	String studentID; 
	String phone;
	String email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String birtday, String gender, String bloodtype) {
		super(birtday, gender, bloodtype);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String studentID, String phone, String email) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
