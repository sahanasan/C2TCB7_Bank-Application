
package com.tns.Framework;


public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	public void withdraw()
	{
		float withdraw=25000;
		if(accBal>=withdraw) {
			System.out.println(accNo+" "+accNm+" "+"withdrawn:"+" "+ withdraw);
			accBal-=withdraw;
			System.out.println("balance after withdraw:"+accBal);}
		else {
			System.out.println(accNm+"you cannot withdraw"+withdraw);
			
		}
	}
	
		
		
	

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getAccNm()="
				+ getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
