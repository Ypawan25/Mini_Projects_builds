package com.useCases;

import java.util.Scanner;

import com.Dao.AccountantDaoImpl;
import com.modal.Accountant;

public class AccountantLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the username");
		String username = sc.next();
		
		System.out.println("Enter the password");
		String password = sc.next();
		
		AccountantDaoImpl acc = new AccountantDaoImpl();
		
		Accountant accountant = acc.accountantLogin(username, password);
		
		System.out.println("Welcome "+accountant.getUsername());
	}

}
