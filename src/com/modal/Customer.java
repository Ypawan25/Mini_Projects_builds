package com.modal;

public class Customer {

		private int cid;
		private String name;
		private String adress;
		private String email;
		private String pass;
		
		
		public Customer() {
			// TODO Auto-generated constructor stub
		}

		public Customer(int id, String name, String adress, String email, String pass) {
			super();
			this.cid = id;
			this.name = name;
			this.adress = adress;
			this.email = email;
			this.pass = pass;
			
		}

		public int getId() {
			return cid;
		}

		public void setId(int id) {
			this.cid = id;
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

		

		@Override
		public String toString() {
			return "Customer [id=" + cid + ", name=" + name + ", adress=" + adress + ", email=" + email + ", pass="
					+ pass +"]";
		}
		
		
		
}
