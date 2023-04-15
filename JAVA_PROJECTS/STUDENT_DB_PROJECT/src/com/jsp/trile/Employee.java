package com.jsp.trile;

public class Employee {
	String id;
	String name;
	 static int count=1;
	public Employee(String name) {
		this.id="A"+count;
		this.name=name;
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("mahesh");
		System.out.println("id :"+e1.id+"name :"+e1.name);
		Employee e2=new Employee("mahesh");
		System.out.println("id :"+e2.id+"name :"+e2.name);
		Employee e3=new Employee("mahesh");
		System.out.println("id :"+e3.id+"name :"+e3.name);

	}

}
