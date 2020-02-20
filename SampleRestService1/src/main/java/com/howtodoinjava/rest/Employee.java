package com.howtodoinjava.rest;

public class Employee {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Employee() {
		
	}
	
	public Employee(Integer id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public String toString() {
		return "Employee[id=" + ", firstName = " + firstName + ", lastName = " + lastName + ", email = " + email + "]";
	}
	
}
