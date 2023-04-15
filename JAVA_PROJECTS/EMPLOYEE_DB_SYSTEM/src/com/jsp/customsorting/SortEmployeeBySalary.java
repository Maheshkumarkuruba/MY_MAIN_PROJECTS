package com.jsp.customsorting;

import java.util.Comparator;

import com.jsp.edbms.Employee;

public class SortEmployeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Double x=o1.getSal();
		Double y=o2.getSal();
		return x.compareTo(y);
		//return o1.getSal().compareTo(o2.getSal());
	}

}
