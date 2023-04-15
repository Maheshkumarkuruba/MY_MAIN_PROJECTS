package com.jsp.customsorting;

import java.util.Comparator;

import com.jsp.edbms.Employee;

public class SortEmployeeByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Integer x=o1.getAge(); // assume 21
		Integer y=o2.getAge(); // assume 22
		return x.compareTo(y); //return 21.compareTo(22);
		//return o1.getAge()-o2.getAge();
	}
//o1==> is the inserting element
//o2==> is the already existing element
}
