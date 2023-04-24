package com.JSP.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.JSP.demo.dao.EmployeeRepo;
import com.JSP.demo.module.Employee;
import com.JSP.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService serv;
	
	@PostMapping("addEmployee")
	ResponseEntity<Employee> addEmployee (@RequestBody Employee e) {
		return new ResponseEntity<Employee>(serv.addEmployee(e),HttpStatus.CREATED);
	}
	
	@GetMapping("employeeById")
	ResponseEntity<Employee> employeeById (@RequestHeader Integer eid) {
		return new ResponseEntity<Employee>(serv.empById(eid),HttpStatus.FOUND);
	}
	@GetMapping("employeeBydesignation")
	ResponseEntity<List<Employee>> empBYDesignation  (@RequestHeader String designation) {
		return new ResponseEntity<List<Employee>>(serv.empByDesignation(designation),HttpStatus.FOUND);
	}
	
	@GetMapping("employeeBysalary")
	ResponseEntity<List<Employee>> empLessThenSalary  (@RequestHeader Double  salary) {
		return new ResponseEntity<List<Employee>>(serv.empLessThenSalary(salary),HttpStatus.FOUND);
	}

	@PutMapping("updateemp")
	ResponseEntity<Employee>  updateEmployee(@RequestBody Employee e) {
		return new ResponseEntity<Employee>(serv.updateEmployee(e),HttpStatus.OK);
	}
	
	@DeleteMapping("deleteemp")
	ResponseEntity<Employee>  deleteEmployee(@RequestParam Integer eid) {
		return new ResponseEntity<Employee>(serv.deleteEmployee(eid),HttpStatus.OK);
	}
}
