package com.useCases;

import java.util.Scanner;

import com.Dao.CustomerDao;
import com.Dao.CustomerDaoImpl;
import com.modal.Customer;

public class RegisterCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of Cutomer");
		String name = sc.next();
		System.out.println("Enter the address of Cutomer");
		String address = sc.next();
		System.out.println("Enter the email of Cutomer");
		String email = sc.next();
		System.out.println("Enter the password of Cutomer");
		String pass = sc.next();
		
		
		Customer cust = new Customer();
		cust.setName(name);
		cust.setAdress(address);
		cust.setEmail(email);
		cust.setPass(pass);
		
		
		CustomerDao cusDao = new CustomerDaoImpl();
		
		String result = cusDao.addcustomer(cust);
		
		System.out.println("Customer Enrolled");
		

	}

}
