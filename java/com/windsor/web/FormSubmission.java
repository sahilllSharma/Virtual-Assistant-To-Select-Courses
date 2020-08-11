package com.windsor.web;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class FormSubmission {
	@Id
	private String fname;
	private String lname;
	private String phone;
	private String email;
	private String application;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	@Override
	public String toString() {
		return "FormSubmission [fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", email=" + email
				+ ", application=" + application + "]";
	}

}
