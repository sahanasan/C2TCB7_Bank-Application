package com.tns.Application;

import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean  isSalaries) {
		MMSavingAcc mmsaving = new MMSavingAcc(AccNo,accNm,accBal,isSalaries);
				return mmsaving;
	}
		
	

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		
		MMCurrentAcc mmcurrent =  new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
		return mmcurrent;
	}
	
	
}



	
	
	
	
