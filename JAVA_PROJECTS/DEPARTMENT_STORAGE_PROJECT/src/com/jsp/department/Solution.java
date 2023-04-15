package com.jsp.department;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter To xyz Department Store");
		System.out.println("------------------------------");
		Scanner sc=new Scanner(System.in);
//		DepartmentalStrore dp=new DepartmentalStoreImpl();
		DepartmentalStrore de=new DepartmentalStoreImpl();
		de.addProduct();
		int choice=1;
		while(choice==1) {
			de.displayProduct();
			de.buyProduct();
			System.out.println("----------------------");
			System.out.println("Press 1 To Continue Shoppping or Any Other Number To Checkout");
			choice =sc.nextInt();
		}
		
		de.checkout();

	}

}
