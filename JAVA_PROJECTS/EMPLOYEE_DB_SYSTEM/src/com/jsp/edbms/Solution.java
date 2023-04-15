package com.jsp.edbms;
import java.util.*;

import com.jsp.customexception.IvalidChoiceException;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeDatabaseManagmentSystem em=new EmployeeDatabaseManagmentSystemImpl();
		while(true) {
			System.out.println(" 1.Add Employee\n 2.Display Employee\n 3.Eisplay All Employees\n 4.Remove Employee\n 5.Remove All Employees\n 6.Update Employee\n 7.Count Employees\n 8.Sortemployees\n 9.GetHighestEmployeeSalary\n 10.GetLowestEmployeeSalary\n 11.Exsit");
			System.out.println("Enter Your Choice Here:");
			switch(sc.nextInt()) {
			case 1:
				em.addEmployee();
				break;
			case 2:
				em.displayEmployee();
				break;
			case 3:
				em.displayAllEmployees();
				break;
			case 4:
				em.removeEmployee();
				break;
			case 5:
				em.removeAllEmployees();
				break;
			case 6:
				em.updateEmployee();
				break;
			case 7:
				em.countEmployees();
				break;
			case 8:
				em.sortEmployees();
				break;
			case 9:
				em.getHighestSalary();
				break;
			case 10:
				em.getHighestSalary();
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
			System.out.println("=====================");
		}
	}

}
