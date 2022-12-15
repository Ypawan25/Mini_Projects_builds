package com.Dao;

import com.modal.Customer;

public interface CustomerDao {
	
	public String addcustomer(Customer customer);
	
	public String addAccountTocustomer(int cus_id, int amount, String branch);
	
	public Customer customerLogin(String username, String password);
	

}
