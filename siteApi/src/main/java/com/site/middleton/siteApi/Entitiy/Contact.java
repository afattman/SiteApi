package com.site.middleton.siteApi.Entitiy;

public class Contact {

	int id;
	String name;
	String email;
	String message;
	
	public Contact(int id, String name, String email, String message) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.message = message;
	}
	public Contact() {	}
	
	public void setId(int id) {
		id = this.id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String Name) {
		Name = this.name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		email = this.email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setMessage(String message) {
		message = this.message;
	}
	
	public String getMessage() {
		return message;
	}
}
