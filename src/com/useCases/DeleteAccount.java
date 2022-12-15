package com.useCases;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDaoImpl;

public class DeleteAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Account to delete");
		int acc = sc.nextInt();
		
		AccountDao adao = new AccountDaoImpl();
		String msg = adao.deleteAccount(acc);
		System.out.println(msg);

	}

}
