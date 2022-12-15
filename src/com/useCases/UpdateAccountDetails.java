package com.useCases;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDaoImpl;

public class UpdateAccountDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Account Number to update");
		int ac = sc.nextInt();
		System.out.println("Enter the New Branch");
		String br = sc.next();
		System.out.println("Enter the New balance");
		int bl = sc.nextInt();
		
		AccountDao acdao = new AccountDaoImpl();
		
		String msg = acdao.editAccount(ac, br, bl);
		System.out.println(msg);
		
		
	}

}
