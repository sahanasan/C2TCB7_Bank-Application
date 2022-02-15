package com.tns.Application;

import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;
import com.tns.Framework.BankFactory;

public class MMBankFactory extends BankFactory {


	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		float withdraw=25000;
		if(accBal>=withdraw) {
			System.out.println(accNo+ " " +accNm+" " + "withdrawn:" + " "+ withdraw);
			accBal-=withdraw;
			System.out.println("balance after withdraw:" + accBal);}
		else {
			System.out.println(accNm + "you cannot withdraw" + withdraw);
		}
			
		 return null;
		
		}
	
@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit){
	
	float deposit=45000;
	System.out.println(accNm+"deposit:"+deposit);
	accBal+=deposit;
	System.out.println("balance after deposit:"+accBal);
		return  null;
	}
}



	
	
	
	
