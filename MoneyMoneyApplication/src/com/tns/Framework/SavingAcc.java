package com.tns.Framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}


public void  withdraw(float accBal)
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
	return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + ", getAccNm()=" + getAccNm()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}


public boolean isSalaried() {
	return isSalaried;
}


public void setSalaried(boolean isSalaried) {
	this.isSalaried = isSalaried;
}
}









