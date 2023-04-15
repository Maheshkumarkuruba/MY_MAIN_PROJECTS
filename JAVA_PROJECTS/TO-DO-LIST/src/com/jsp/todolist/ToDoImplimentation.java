package com.jsp.todolist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.text.SimpleDateFormat;


public class ToDoImplimentation {
	Scanner scan = new Scanner(System.in);
	List<ToDoList> doList = new ArrayList<ToDoList>(); 

	public void toPrintTodos() {
		System.out.println("1.to print all Todos\n2.to print open todos\n3.to print done todos ");
		int input=scan.nextInt();
		switch(input) {
		case 1:
			printAllCurentToDos();
			break;
		case 2:
			printOpenTodo();
			break;
		case 3:
			printDoneTodo();
			break;
		default:
			System.out.println("invalid choice entered");
		}
	}

	public void printAllCurentToDos() {

		System.out.println("you have "+doList.size()+" TODOs:");
		if(doList.size()!=0) {
			for(int i=0;i<doList.size();i++) {
				//				System.out.println(doList.toString());
				System.out.println(doList.get(i));
			}
		}
		else {
			try {
				String msg= "Your TODO is Empty...! Nothing to Show ";
				throw new  EmptyToDoListException(msg);

			}
			catch(Exception e) {

				System.out.println(e.getMessage());

			}
		}

	}


	public void addNewToDos() {
		System.out.println("enter the new todo");
		String text=scan.nextLine().toLowerCase();
		System.out.println("Enter priority");
		String priority = scan.nextLine();
		System.out.println("Enter due date year");
		String year = scan.nextLine();
		System.out.println("Enter due date month");
		String month = scan.nextLine();
		System.out.println("Enter due date day");
		String day = scan.nextLine();
		System.out.println("enter the status");
		String status=scan.nextLine().toUpperCase();
		ToDoList to=new ToDoList(text, priority, year, month, day, status);
		doList.add(to);
	}


	public void markAsDone() {
		int c=0;
		if(doList.size()!=0) {
			System.out.println("Enter TODO to change to DONE");
			scan.nextLine();
			String todo = scan.nextLine().toLowerCase();
			//			System.out.println(todo);
			for(int i=0;i<doList.size();i++) {	
				c++;
				ToDoList to2=doList.get(i);
				//				System.out.println(to2.getTodo());
				//				System.out.println(todo);
				if(to2.getTodo().equals(todo)) {
					to2.setStatus("DONE");
					//				System.out.println("Done: "+ doList.);
					//				doList.remove(todo);
					break;
				}
				else if (c>=doList.size()) {
					try {
						String msg= "The Entered TODO is Not Present...! please check the list once again and enter the correct TODO to mark as done ";
						throw new  EmptyToDoListException(msg);
					}

					catch(Exception e) {

						System.out.println(e.getMessage());

					}
					break;
				}


			}

		}
		else {
			try {
				String msg= "you havent Added the dolist and  completed a single task yet please complete and mark as done";
				throw new  EmptyToDoListException(msg);

			}
			catch(Exception e) {

				System.out.println(e.getMessage());

			}
		}
	}

	public void printOpenTodo() {
		if(doList.size()!=0) {
			for(int i=0;i<doList.size();i++) {
				ToDoList lis=doList.get(i);
				if(lis.getStatus().equals("OPEN")) {
					System.out.println(doList.get(i));
				}
				else {
					System.out.println("There are no open Todos,all Todos are Done");
					break;
				}
			}

		}
		else {
			try {
				String msg= "Your TODO is Empty...! Nothing to Show ";
				throw new  EmptyToDoListException(msg);

			}
			catch(Exception e) {

				System.out.println(e.getMessage());

			}
		}

	}

	public void printDoneTodo() {
		if(doList.size()!=0) {
			for(int i=0;i<doList.size();i++) {
				ToDoList lis=doList.get(i);
				if(lis.getStatus().equals("DONE")) {
					System.out.println(doList.get(i));
				}
				else {
					System.out.println("There are no done Todos,all Todos are open");
					break;
				}
			}

		}
		else {
			try {
				String msg= "Your TODO is Empty...! Nothing to Show ";
				throw new  EmptyToDoListException(msg);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public void updatePriorityAndDueDate() {
		System.out.println("Enter TODO to change");
		//		scan.nextLine();
		String change = scan.nextLine().toLowerCase();
		for(int i=0;i<doList.size();i++) {	
			ToDoList to3=doList.get(i);
			//			System.out.println(to3.getTodo());
			if(to3.getTodo().equals(change)) {
				System.out.println("Enter priority");
				String priority = scan.nextLine();
				to3.setPriority(priority);
				System.out.println("Enter due date year");
				String year = scan.nextLine();
				to3.setYear(year);
				System.out.println("Enter due date month");
				String month = scan.nextLine();
				to3.setMonth(month);
				System.out.println("Enter due date day");
				String day = scan.nextLine();
				to3.setDay(day);
				System.out.println("Priority and Due date is Updated sucessfully!");

			}
			else {
				try {
					String msg= "The Entered TODO is Not Present...! please check the list once again and enter the correct TODO to mark as done ";
					throw new  EmptyToDoListException(msg);
				}

				catch(Exception e) {

					System.out.println(e.getMessage());

				}
				break;
			}


		}
		//		nearingTodo();

	}
	public void nearingTodo() {
		Date thisDate = new Date();
		SimpleDateFormat dateform = new SimpleDateFormat("yyyy/mm/dd");
		String sysDate= dateform.format(thisDate.getDay());
		Integer sysdate=Integer.parseInt(sysDate);
		System.out.println(sysdate);
		for(int i=0;i<doList.size();i++) {	
			ToDoList to4=doList.get(i);	
			String s=to4.getDay();
			Integer date= Integer.parseInt(s);
			int subdate= sysdate-date;
			System.out.println("near due date"+subdate);
		}
	}
}
