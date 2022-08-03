package org.greenstask;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	String name;
	int bal;
	int ID;
	
	public Customer(String n,int b, int i) {
		name=n;
		bal=b;
		ID=i;
	}
	
	@Override
	public String toString() {
		return "|Name is : "+name+" + |Balance is "+bal+" |ID is "+ID+"|\n";
	}
	
	public static void main(String[] args) {
		List<Customer> arr = new ArrayList<Customer>();
		Customer customer1=new Customer("Praveen", 350, 001);
		Customer customer2=new Customer("Priya", 152, 002);
		Customer customer3=new Customer("Kumar", 380, 003);
		Customer customer4=new Customer("Dinesh", 163, 004);
		
		arr.add(customer1);
		arr.add(customer2);
		arr.add(customer3);
		arr.add(customer4);
		
		for (Customer cus : arr) {
			System.out.println(cus);
		}
	}
	
}