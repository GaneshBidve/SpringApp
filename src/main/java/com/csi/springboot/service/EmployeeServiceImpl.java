package com.csi.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.csi.springboot.model.Employee;
import com.csi.springboot.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
	}

}
