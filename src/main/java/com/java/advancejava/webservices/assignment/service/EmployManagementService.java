package com.java.advancejava.webservices.assignment.service;

import java.util.List;

import com.java.advancejava.webservices.assignment.model.Employee;

public interface EmployManagementService {

	public List<Employee> getAllEmploys();

	public void addEmployee(Employee employee);

	public void updateEmployee(Employee emp);

	public void delete(int id);
}
