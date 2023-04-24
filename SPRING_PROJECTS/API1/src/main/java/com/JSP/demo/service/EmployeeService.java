package com.JSP.demo.service;

import java.util.List;

import com.JSP.demo.module.Employee;

public interface EmployeeService {
	
Employee addEmployee(Employee e);
Employee empById(Integer eid);
List<Employee> empByDesignation(String designation);
List<Employee> empLessThenSalary(Double salary);
Employee updateEmployee(Employee e);
Employee deleteEmployee(Integer e);
}
