package com.tns.Framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalary;
	private static float MINBAL;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.setSalary(isSalary);

	}

	@Override
	public void withdraw(float amount) {
		if(accBal>=amount) {
			accBal=accBal-amount;
			System.out.println("balance after withdrawal:"+accBal);
		}else {
			System.out.println("your balance is less than"+amount+"\tTransaction failed...!!");
		}
	super.withdraw(amount);
	}

	

	@Override
	public String toString() {
		return super.toString();
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	public static float getMINBAL() {
		return MINBAL;
	}

	public static void setMINBAL(float mINBAL) {
		MINBAL = mINBAL;
	}

}









