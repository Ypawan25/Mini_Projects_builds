package com.useCases;

import java.util.List;

import com.Dao.AccountDao;
import com.Dao.AccountDaoImpl;
import com.modal.CustomerAccountDTO;

public class PrintAllAcountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDao acdo = new AccountDaoImpl();
		
		List<CustomerAccountDTO> listResult = acdo.getAllAcountDetails();
		
		for(CustomerAccountDTO x:listResult) {
			System.out.println("Customer name is "+x.getName());
			System.out.println("Customer Id is "+x.getCid());
			System.out.println("Customer Address is "+x.getAdress());
			System.out.println("Customer email is "+x.getEmail());
			System.out.println("Customer Account number is "+x.getAccNo());
			System.out.println("Customer Branch is "+x.getBranch());
			System.out.println("Customer Balance is "+x.getBalance());
			System.out.println("************************************************");
			System.out.println("************************************************");
			
		}

	}

}
