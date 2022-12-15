package com.useCases;

import java.util.Scanner;

import com.Dao.CustomerDao;
import com.Dao.CustomerDaoImpl;
import com.modal.Customer;

public class CustomerLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the username");
		String username = sc.next();
		
		System.out.println("Enter the password");
		String password = sc.next();
		
		CustomerDao cusdoa = new CustomerDaoImpl();
		
		Customer customer = cusdoa.customerLogin(username, password);
		
		System.out.println("Welcome "+customer.getName());

	}

}
