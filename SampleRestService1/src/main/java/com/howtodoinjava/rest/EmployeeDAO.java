package com.howtodoinjava.rest;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	
	private static Employees list = new Employees();
	
	static
	{
		list.getEmployeeList().add(new Employee(1, "Sachin", "Tendulkar", "s.tendulkar@gmail.com"));
		list.getEmployeeList().add(new Employee(2, "Rohit", "Sharma", "sharma.rohit@outlook.com"));
		list.getEmployeeList().add(new Employee(3, "Virat", "Kohli", "vk@yahoo.com"));
	}
	
	public Employees getAllEmployees()
	{
		return list;
	}
	
	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);
	}
}
