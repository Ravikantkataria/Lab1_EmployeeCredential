package com.glearning.pg.model;

public class Employee {
	
	private final String firstName;
	private final String lastName;
	private String dept;
	private String password;
	private String emailAddress;
	
	
	public Employee(String firstName, String lastName) {
		this.firstName= firstName;
		this.lastName = lastName;
	}

public String getFirstName() {
	return firstName;
}


public String getLastName() {
	return lastName;
}

public String getPassword() {
	return password;
}

public void SetPassword(String password) {
	this.password = password;
}




public String setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
	return emailAddress;
}

public String getEmailAddress() {
	return emailAddress;
	}


	public String getDept() {
		return dept;
	}

	public String setDept(String dept) {
		return this.dept = dept;
	}

}
