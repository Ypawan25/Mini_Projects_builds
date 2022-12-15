package com.useCases;

import java.util.Scanner;

import com.Dao.CustomerDao;
import com.Dao.CustomerDaoImpl;

public class OpenAccountforCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer id");
		int id = sc.nextInt();
		System.out.println("Enter the Amount to deposite");
		int amount = sc.nextInt();
		System.out.println("Enter the bank branch for account");
		String branch = sc.next();
		
		CustomerDao cdao = new CustomerDaoImpl();
		String msg = cdao.addAccountTocustomer(id, amount, branch);
		
		System.out.println(msg);
		

	}

}
