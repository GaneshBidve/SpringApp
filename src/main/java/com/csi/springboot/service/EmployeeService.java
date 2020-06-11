package com.csi.springboot.service;

import java.util.List;

import com.csi.springboot.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();

	public void saveEmployee(Employee employee);

}
