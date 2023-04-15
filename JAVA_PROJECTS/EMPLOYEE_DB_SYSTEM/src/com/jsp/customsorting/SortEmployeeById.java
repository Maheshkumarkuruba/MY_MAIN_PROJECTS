package com.jsp.customsorting;

import java.util.Comparator;

import com.jsp.edbms.Employee;

public class SortEmployeeById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		String x=o1.getId();
		String y=o2.getId();
		return x.compareTo(y);
		//return o1.getId().compareTo(o2.getId());
	}

}
