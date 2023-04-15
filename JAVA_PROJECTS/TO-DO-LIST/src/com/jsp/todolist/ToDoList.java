package com.jsp.todolist;

public class ToDoList {
	private String todo;
	private String priority;
	private String year;
	private String month;
	private String day;
	private String status;
		
	public ToDoList(String todo, String priority, String year, String month, String day, String status) {
		super();
		this.todo = todo;
		this.priority = priority;
		this.year = year;
		this.month = month;
		this.day = day;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return status+":"+todo +"(priority=" + priority + ", Due " + year + "-" + month + "-" + day + ")";
	}

//	public static void getStatus() {
//		status="Done";
//	}
	
}
