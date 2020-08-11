package com.windsor.web;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactUs {
	@Id
	private String name;
	private String message;
	private String email;
	private String subject;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "ContactUs [message=" + message + ", name=" + name + ", email=" + email + ", subject=" + subject + "]";
	}
	

}
