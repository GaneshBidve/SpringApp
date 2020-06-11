package com.csi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csi.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
