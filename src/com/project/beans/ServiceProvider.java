package com.project.beans;

public class ServiceProvider {
	String name;
	int id;
	
	String service;
	String area;
	String charge;
	String contact;
	String password;
	String requestContact;
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setRequestContact(String requestContact) {
		this.requestContact = requestContact;
	}
	
	public String getRequestContact() {
		return requestContact;
	}
	

}
