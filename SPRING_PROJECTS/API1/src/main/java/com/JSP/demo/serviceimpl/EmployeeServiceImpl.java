package com.JSP.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JSP.demo.dao.EmployeeRepo;
import com.JSP.demo.exception.ResourceNotFoundException;
import com.JSP.demo.module.Employee;
import com.JSP.demo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepo repo;

	@Override
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return repo.save(e);
	}

	@Override
	public Employee empById(Integer eid) {
		return repo.findById(eid).orElseThrow(() -> new ResourceNotFoundException("Employee","id",eid));
		
		
	}

	@Override
	public List<Employee> empByDesignation(String designation) {
		return repo.findByDesignation(designation);
		
		
	}

	@Override
	public List<Employee> empLessThenSalary(Double salary) {
		// TODO Auto-generated method stub
		return repo.empBYLessSal(salary);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		Employee e1=repo.findById(e.getEid()).orElse(null);
		if(e1!=null) {
			e1.setEname(e.getEname());
			e1.setDesignation(e.getDesignation());
			e1.setSalary(e.getSalary());
			e1.setPhno(e.getPhno());
			return repo.save(e1);
		}
		else {
			throw new ResourceNotFoundException("Employee","id",e.getEid());
		}
//		return null;
	}

	@Override
	public Employee deleteEmployee(Integer eid) {
		// TODO Auto-generated method stub
		Employee e=repo.findById(eid).orElse(null);
		if(e!=null) {
		repo.deleteById(eid);	
		return e;
		}
		else {
			throw new ResourceNotFoundException("Employee","id",e.getEid());
		}
	}

//	@Override
//	public List<Employee> empLessThenSalary(double salary) {
//		return repo.empLessThenSalary(salary);
//		
//	}

	
}
