package com.akash;
// who can use access modifiers
public class O2 {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.username = "Akash Chaurasiya";
		System.out.println(b1.username);
//		b1.password = "12345678";
		b1.setPassword("1234556789");
//		Not seen a password only change
//		System.out.println(b1.password);
	}
}

class BankAccount{
	public String username;
	private String password;
	
//	Create set Method only change password allow
	void setPassword(String pwd) {
		password = pwd;
	}
}
