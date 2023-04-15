package com.jsp.department;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStoreImpl implements DepartmentalStrore {
	Scanner sc=new Scanner(System.in);
	Map<Integer,Product> mp=new LinkedHashMap<Integer,Product>();
	int totalbill;
	@Override
	public void addProduct() {
		// TODO Auto-generated method stub
		//		System.out.println("enter your productname");
		//		String name=sc.next();
		//		System.out.println("enter your quantity");
		//		int quantity=sc.nextInt();
		mp.put(1,new Product("Chocolate",20,20));
		mp.put(2,new Product("Biscuit ",10,25));
		mp.put(3,new Product("Ice_cream ",20,50));

	}

	@Override
	public void displayProduct() {
		// TODO Auto-generated method stub
		Set<Integer> keys=mp.keySet();
		for(Integer val:keys) {
			Product p=mp.get(val);
			System.out.println("Enter : "+val+" To get : "+p.getName());
			System.out.println("Available Quantities : "+p.getCost());
			System.out.println("Cost : "+p.getCost());
			System.out.println("=========================");
		}
	}

	@Override
	public void buyProduct() {
		// TODO Auto-generated method stub
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		Product p=mp.get(choice);
		if(p!=null) {
			System.out.println("Enter The Quantity");
			int quantity=sc.nextInt();
			if(quantity<=p.getQuantity()) {
				//calculating the cost of the product
int productcost=quantity*p.getCost();
//addibd the cost to the totalbill
 totalbill+=productcost;
// setting the product cost again by using setter method
        p.setQuantity(p.getQuantity()-quantity);
        System.out.println("Ordered Quantity "+quantity+" "+p.getName());
        System.out.println("Product cost "+productcost);
        System.out.println("Totalbill As Of Now is "+totalbill);
				
			}
			else {
				try {
					throw new IvalidQuantityException("Invalid Quantity"+p.getName() +"is Not Available");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		else {
			try {
				throw new IvalidException("Invalid Choice Entered");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		System.out.println("Toltal Bill: "+totalbill);
		System.out.println("Thankyou For Shopping");

	}

}
