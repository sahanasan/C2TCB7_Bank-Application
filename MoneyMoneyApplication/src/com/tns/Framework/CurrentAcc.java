
package com.tns.Framework;


public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
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
	public float getCreditLimit() {
		return creditLimit;
		
	}

}