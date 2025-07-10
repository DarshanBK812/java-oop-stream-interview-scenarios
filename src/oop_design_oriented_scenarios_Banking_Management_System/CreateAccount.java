package oop_design_oriented_scenarios_Banking_Management_System;

public class CreateAccount {

	public static void main(String[] args) {
		Account account = new SavingAccount("SBI", 1, "darshan", 10, "Saving");
		System.out.println(account);
		account.deposite(10);
		System.out.println(account.getAccBal());
		
		try {
			account.withDraw(30);
		} catch (Exception e) {
			System.out.println("no");
			System.out.println(e.getMessage());
		}
		
		System.out.println(account.getAccBal());

	}

}
