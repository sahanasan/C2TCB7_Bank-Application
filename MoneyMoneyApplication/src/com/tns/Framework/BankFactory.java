package com.tns.Framework;

public abstract class BankFactory {
	public abstract SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried);{

	float withdraw=1000;

	}
	
	public abstract CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit);
	{
		float deposit=2000;
	}
}
