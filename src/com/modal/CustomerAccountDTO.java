package com.modal;

public class CustomerAccountDTO {
	private int cid;
	private String name;
	private String adress;
	private String email;
	private String pass;
	
	private int accNo;
	private String branch;
	private int balance;
	
	public CustomerAccountDTO() {
		// TODO Auto-generated constructor stub
	}

	public CustomerAccountDTO(int cid, String name, String adress, String email, String pass, int accNo, String branch,
			int balance) {
		super();
		this.cid = cid;
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.pass = pass;
		this.accNo = accNo;
		this.branch = branch;
		this.balance = balance;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CustomerAccountDTO [cid=" + cid + ", name=" + name + ", adress=" + adress + ", email=" + email
				+ ", pass=" + pass + ", accNo=" + accNo + ", branch=" + branch + ", balance=" + balance + "]";
	}
	
	
	
}
