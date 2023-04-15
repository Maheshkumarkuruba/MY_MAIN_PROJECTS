package com.jsp.edbms;
import java.util.*;
import com.jsp.customexception.*;
import com.jsp.customsorting.*;
public class EmployeeDatabaseManagmentSystemImpl implements EmployeeDatabaseManagmentSystem {
Scanner sc=new Scanner(System.in);
Map<String,Employee> mp=new LinkedHashMap<String,Employee>();
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter the employee name");
		String name=sc.next();
		System.out.println("Enter the employee age");
		int age=sc.nextInt();
		System.out.println("Enter the employee salary");
		double sal=sc.nextDouble();
		Employee e1= new Employee(name,age,sal);
		mp.put(e1.getId(), e1);
		System.out.println("Employee successfully added");
		System.out.println("employee id :"+e1.getId());
	}

	@Override
	public void displayEmployee() {
		// TODO Auto-generated method stub
		System.out.println("enter the employee id");
		String id=sc.next();
		id=id.toUpperCase();
		if(mp.containsKey(id)) {
			Employee emp=mp.get(id);
			System.out.println("emp id:"+emp.getId());
			System.out.println("emp name:"+emp.getName());
			System.out.println("emp age:"+emp.getAge());
			System.out.println("emp sal:"+emp.getSal());
		}
		else {
			String message="Employee id:"+id+"not found";
			try {
				throw new EmployeeNotFound(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void displayAllEmployees() {
		// TODO Auto-generated method stub
		if(mp.size()!=0) {
		Set<String> key=mp.keySet();
		for(String val:key) {
			System.out.println(mp.get(val));
		}
		}
		else {
			String message="Employee database managment system is empty";
			try {
				throw new EmployeeNotFound(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void removeEmployee() {
		// TODO Auto-generated method stub
		System.out.println("enter the employee id");
		String id=sc.next();
		id=id.toUpperCase();
		if(mp.containsKey(id)) {
			System.out.println("employee found");
			mp.remove(id);
			System.out.println("employee is removed");
		}
		else {
			String message="Employee id:"+id+"not found";
			try {
				throw new EmployeeNotFound(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void removeAllEmployees() {
		// TODO Auto-generated method stub
		if(mp.size()!=0) {
			mp.clear();
			System.out.println("All Employee are Removed");
		}
		else {
			String message="Employee database is empty";
			try {
				throw new EmployeeNotFound(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println(" 1.update name\n 2.upade age\n 3.upadate salary");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		System.out.println("enter the employee id");
		String id=sc.next().toUpperCase();
		Employee emp=mp.get(id);
		switch(choice) {
		case 1:	
			System.out.println("Employee Found, Enter the NewName");
			String name=sc.next();
			emp.setName(name);
			break;
		case 2:
			int age=sc.nextInt();
			emp.setAge(age);
			break;
		case 3:
			double salary=sc.nextInt();
			emp.setSal(salary);
			break;
			default:
				String message="Invalid choice entered";
				try {
					throw new IvalidChoiceException(message);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		}
	}

	@Override
	public void countEmployees() {
		// TODO Auto-generated method stub
		System.out.println("No of Employees:"+mp.size());
		
	}

	@Override
	public void sortEmployees() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void getHighestSalary() {
		// TODO Auto-generated method stub
		Set<String> key=mp.keySet();
		List<Employee> li=new ArrayList<Employee>();
		for(String val:key) {
		li.add(mp.get(val));
		}
		Collections.sort(li,new SortEmployeeBySalary());
		System.out.println(li.get(0));
	}

	@Override
	public void getLowestSalary() {
		// TODO Auto-generated method stub
		
	}

}
