package com.jsp.customsorting;

import java.util.Comparator;

import com.jsp.edbms.Employee;

public class SortEmployeeByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
