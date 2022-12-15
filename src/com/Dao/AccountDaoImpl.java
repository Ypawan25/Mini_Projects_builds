package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Utility.DBUTIL;
import com.modal.CustomerAccountDTO;

public class AccountDaoImpl implements AccountDao{

	@Override
	public String deleteAccount(int account_no) {
		
		String msg = "Account Does not exist";
		
		try (Connection conn = DBUTIL.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("delete from account where account = ?");
			ps.setInt(1, account_no);
			
			int x = ps.executeUpdate();
			if(x>0)
				msg = "Account Deleted";
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msg = e.getMessage();
		}		
				
		return msg;
	}

	@Override
	public String editAccount(int account_no,String branch,int balance) {

		String msg = "Account details not updated";
		
		try (Connection conn = DBUTIL.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update account set branch = ? ,balance = ? where account = ?");
			ps.setString(1,branch);
			ps.setInt(2, balance);
			ps.setInt(3, account_no);
			int x = ps.executeUpdate();
			if(x>0)
				msg = "Details Updated";
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msg = e.getMessage();
		}
		return msg;
	}

	@Override
	public CustomerAccountDTO getAcountDetails(int accNumber) {
		
		CustomerAccountDTO cadto = null;
		
		try (Connection conn= DBUTIL.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select c.cid, c.name,c.address, c.email, a.account, a.branch, a.balance "
					+ "from customer c INNER JOIN account a ON c.cid = a.cid AND a.account = ?");
			
			
			ps.setInt(1, accNumber);
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
			 cadto = new CustomerAccountDTO();
				cadto.setCid(rs.getInt("cid"));
				cadto.setName(rs.getString("name"));
				cadto.setAdress(rs.getString("address"));
				cadto.setEmail(rs.getString("email"));
				cadto.setAccNo(rs.getInt("account"));
				cadto.setBranch(rs.getString("branch"));
				cadto.setBalance(rs.getInt("balance"));				
				
			}	
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
		return cadto;
	}

	@Override
	public List<CustomerAccountDTO> getAllAcountDetails() {
		
List<CustomerAccountDTO> calist = new ArrayList<>();
		
		try (Connection conn= DBUTIL.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select c.cid, c.name,c.address, c.email, a.account, a.branch, a.balance "
					+ "from customer c INNER JOIN account a ON c.cid = a.cid");		
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				CustomerAccountDTO cadto = new CustomerAccountDTO();
				cadto.setCid(rs.getInt("cid"));
				cadto.setName(rs.getString("name"));
				cadto.setAdress(rs.getString("address"));
				cadto.setEmail(rs.getString("email"));
				cadto.setAccNo(rs.getInt("account"));
				cadto.setBranch(rs.getString("branch"));
				cadto.setBalance(rs.getInt("balance"));
				
				calist.add(cadto);				
				
			}	
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
		return calist;
	}

	

}
