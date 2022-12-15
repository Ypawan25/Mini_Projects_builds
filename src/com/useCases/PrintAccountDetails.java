package com.useCases;

import java.util.List;
import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDaoImpl;
import com.modal.CustomerAccountDTO;

public class PrintAccountDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number for details");
		int acNo = sc.nextInt();
		AccountDao acdo = new AccountDaoImpl();
		
		CustomerAccountDTO x = acdo.getAcountDetails(acNo);
		
		
			System.out.println("Customer name is "+x.getName());
			System.out.println("Customer Id is "+x.getCid());
			System.out.println("Customer Address is "+x.getAdress());
			System.out.println("Customer email is "+x.getEmail());
			System.out.println("Customer Account number is "+x.getAccNo());
			System.out.println("Customer Branch is "+x.getBranch());
			System.out.println("Customer Balance is "+x.getBalance());
			
		

	}

}
