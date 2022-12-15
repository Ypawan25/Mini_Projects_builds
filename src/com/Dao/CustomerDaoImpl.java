package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Utility.DBUTIL;
import com.modal.Customer;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public String addcustomer(Customer customer) {
		String msg = "Not added";
		
		try (Connection conn = DBUTIL.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into customer "
					+ "(name,address,email,password) values(?,?,?,?)");
			ps.setString(1, customer.getName());
			ps.setString(2, customer.getAdress());
			ps.setString(3, customer.getEmail());
			ps.setString(4, customer.getPass());
			
			
			int x = ps.executeUpdate();
			if(x>0)
				msg = "Customer registered";
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		
		
		return msg;
	}

	@Override
	public String addAccountTocustomer(int cus_id, int amount, String branch) {
		String msg ="Not inserted";
		try (Connection conn = DBUTIL.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("Select * from customer where cid = ? ");
			ps.setInt(1, cus_id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				PreparedStatement ps1 = conn.prepareStatement("insert into account (branch,balance,cid) values (?,?,?)");
				ps1.setString(1, branch);
				ps1.setInt(2, amount);
				ps1.setInt(3, cus_id);
				int x = ps1.executeUpdate();
				if(x>0)
					msg = "New Account opened for customer";
			}			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		
		return msg;
	}

	@Override
	public Customer customerLogin(String username, String password) {
		Customer customer = null;
try (Connection conn = DBUTIL.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from customer where email = ? and password = ?");
			ps.setString(1, username);
			ps.setString(2, password);			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				 customer = new Customer();
				 customer.setId(rs.getInt("cid"));
				 customer.setName(rs.getString("name"));
				 customer.setAdress(rs.getString("address"));
				 customer.setEmail(rs.getString("email"));
				 customer.setPass(rs.getString("password"));
			}
			else {
				System.out.println("Wrong credentials");
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
			
		}			
		
		
		
		return customer;
	}

}
