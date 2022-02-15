package com.tns.Application;

import com.tns.Framework.SavingAcc;

public class MMSavingAcc  extends SavingAcc {
	
	public static final float MINBAL=1000;
		
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal,isSalaried);
	}
	public void withdraw(float isSalaried)
	{
		float withdraw=1000;
		super.withdraw(MINBAL);
	}


	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", isSalaried()=" + isSalaried() + ", getAccNm()="
				+ getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
	
	
	
	
	

