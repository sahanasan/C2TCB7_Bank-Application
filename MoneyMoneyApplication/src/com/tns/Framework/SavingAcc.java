package com.tns.Framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalary;
	private static float MINBAL;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.setSalary(isSalary);

	}

	@Override
	public void withdraw(float accBal) 
	{
		System.out.println("withdraw accBal are:" + accBal);
	}
		

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + getAccNm() + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
}









