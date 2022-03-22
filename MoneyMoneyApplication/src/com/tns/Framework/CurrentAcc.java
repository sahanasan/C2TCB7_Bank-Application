
package com.tns.Framework;


public abstract class CurrentAcc extends BankAcc {
	
	protected static float creditLimit= 1000;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
     
	@Override
	public void withdraw(float accBal) {
		
		System.out.println("withdraw are:"+ accBal);
	}
		

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + getAccNm() + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	public float getCreditLimit() {
		return creditLimit;
		
	}

}