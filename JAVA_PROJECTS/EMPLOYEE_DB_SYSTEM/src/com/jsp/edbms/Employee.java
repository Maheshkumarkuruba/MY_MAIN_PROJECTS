package com.jsp.edbms;

public class Employee {
private String name;
private String id;
private int age;
private double sal;
 private static int count=101;
public Employee(String name, int age, double sal) {
	super();
	this.name = name;
	this.id ="A"+count;
	this.age = age;
	this.sal = sal;
	count++;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getSal() {
	return sal;
}

public void setSal(double sal) {
	this.sal = sal;
}


@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", sal=" + sal + "]";
}


}
