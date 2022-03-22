package com.tns.Application;

import com.tns.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static float MINBAL=0;
	
	public float getMINBAL() {
		return MINBAL;
	}

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
				
		}

	@Override
	public void withdraw(float accBal) 
	{
		System.out.println("dear withdraw user, your accBal are:" + accBal);
	}
		



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "GSSavingAcc[]";
	}
	
	
	
}