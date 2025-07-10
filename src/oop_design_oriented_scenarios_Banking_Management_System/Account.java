package oop_design_oriented_scenarios_Banking_Management_System;

public abstract class Account implements Bank {

	private String bankName;
	private int accNumber;
	private String accHolderName;
	private double accBal;

	public Account(String bankName, int accNumber, String accHolderName, double accBal) {
		this.bankName = bankName;
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.accBal = accBal;
	}

	public void bankName(String name) {
		System.out.println("The bank name :" + bankName);
	}

	public abstract void deposite(double money);

	public abstract void withDraw(double money) throws Exception;

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public int getAccNumber() {
		return this.accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	

}
