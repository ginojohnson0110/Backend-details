package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Registrationdetails {
	@Id
	private String uid;
	private String admno;
	private String name;
	private String dob;
	private String classes;
	private String division;
	private String gender;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getAdmno() {
		return admno;
	}
	public void setAdmno(String admno) {
		this.admno = admno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Registrationdetails(String uid, String admno, String name, String dob, String classes, String division,
			String gender) {
		super();
		this.uid = uid;
		this.admno = admno;
		this.name = name;
		this.dob = dob;
		this.classes = classes;
		this.division = division;
		this.gender = gender;
	}
	public Registrationdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
