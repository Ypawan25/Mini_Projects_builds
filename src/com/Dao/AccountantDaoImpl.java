package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Utility.DBUTIL;
import com.modal.Accountant;

public class AccountantDaoImpl implements AccountantDao {

	@Override
	public Accountant accountantLogin(String username, String password) {
		Accountant accountant = null;
		
		try (Connection conn = DBUTIL.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from accountant where username = ? and password = ?");
			ps.setString(1, username);
			ps.setString(2, password);			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				 accountant = new Accountant();
				 accountant.setUsername(rs.getString("username"));
				 accountant.setPassword(rs.getString("password"));
			}
			else {
				System.out.println("Wrong credentials");
			}
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}			
		
		return accountant;
	}

}
