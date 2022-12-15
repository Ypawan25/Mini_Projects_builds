package com.Dao;

import com.modal.Accountant;

public interface AccountantDao {
	
	public Accountant accountantLogin(String username, String password);
}
