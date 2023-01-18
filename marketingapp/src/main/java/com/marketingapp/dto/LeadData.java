package com.marketingapp.dto;

public class LeadData {
private long id;
private String firstName;
private String LastName;
private String email;
private long mobile;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
}
