package Entities;

import java.time.LocalDate;
import java.util.Calendar;

import Abstract.Entity;

public class Customer implements Entity {
 int id;
 public String firstName;
 private String  lastName;
 private Calendar dateOfBirth;
 private String nationaltyId;

 public Customer() {
	 
 }
 public Customer(int id, String firstName, String lastName, Calendar dateOfBirth, String nationaltyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationaltyId = nationaltyId;
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Calendar getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Calendar dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getNationaltyId() {
	return nationaltyId;
}

public void setNationaltyId(String nationaltyId) {
	this.nationaltyId = nationaltyId;
}
public Object getBirthDate() {	
	return null;
}


 
}
