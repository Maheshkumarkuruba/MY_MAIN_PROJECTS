package com.JSP.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.JSP.demo.module.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
	@Query(value="select * from employee where designation=?1", nativeQuery = true)
List<Employee> findByDesignation(String designation);
	@Query(value="select * from employee where salary>=?1", nativeQuery = true)
List<Employee> empBYLessSal(Double salary);
}
