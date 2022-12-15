package com.Dao;

import java.util.List;

import com.modal.CustomerAccountDTO;

public interface AccountDao {
	public String deleteAccount (int account_no);
	
	public String editAccount (int account_no,String branch,int balance);
	
	public CustomerAccountDTO getAcountDetails(int accNumber);
	
	public List<CustomerAccountDTO> getAllAcountDetails();
	
	

}
