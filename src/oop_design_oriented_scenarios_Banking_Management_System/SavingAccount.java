package oop_design_oriented_scenarios_Banking_Management_System;

public class SavingAccount extends Account {

	private String typeAcc;

	public SavingAccount(String bankName, int accNumber, String accHolderName, double accBal, String typeAcc) {
		super(bankName, accNumber, accHolderName, accBal);
		this.typeAcc = typeAcc;
	}

	@Override
	public void deposite(double money) {
		money += getAccBal();
		setAccBal(money);
		System.out.println("Credited");
	}

	@Override
	public void withDraw(double money) throws Exception {
		if (getAccBal() < money)
			throw new Exception("Insufficent Bal");
		System.out.println(getAccBal());
		money = getAccBal() - money;
		setAccBal(money);
		System.out.println("withDrawed");
	}

	@Override
	public String toString() {
		return "AccType :" + typeAcc + " AccNumber :" + getAccNumber() + " HolderName :" + getAccHolderName()
				+ " AccBal :" + getAccBal();
	}

}
