package com.tns.client;

import com.tns.Application.MMBankFactory;
import com.tns.Application.MMCurrentAcc;
import com.tns.Application.MMSavingAcc;
import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class Client {

	 static BankFactory bfobj;
	static SavingAcc mmsavingobj;
    static CurrentAcc mmcurrentobj;

	public static void main(String[] args) {
		
		MMBankFactory mmbankfactory = new MMBankFactory();
		mmbankfactory.getNewSavingAccount(1234, "sahana", 20000, false);
		mmbankfactory.getNewCurrentAccount(4567, "nithin", 10000, 210);
		
		MMSavingAcc mmsaving = new MMSavingAcc(2345,"sahana",40000,true);
		System.out.println(".......transcation details........");
		mmsaving.deposite(40000);
		mmsaving.setAccNo(2345);
		mmsaving.setAccNm("sahana");
		mmsaving.setAccBal(30000);
		mmsaving.setSalary(true);
		mmsaving.setCharges(400);
		mmsaving.withdraw(10000);
		mmsaving.toString();
		MMCurrentAcc mmcurrent = new MMCurrentAcc(4567,"nithin",30000,200);
		System.out.println("............transcation details.......");
		mmcurrent.deposite(30000);
		mmcurrent.setAccNo(0);
		mmcurrent.setAccNm("sahana");
		mmcurrent.setAccBal(2000);
		mmcurrent.setCharges(200);
		mmcurrent.getCreditLimit();
		mmcurrent.withdraw(10000);
		mmcurrent.toString();
	}
}
	
		
		


		
		
	
		
		

		
	
	
	


	
	
		

	
	
	


	

		
		
	
			
			
		
	
	


		
	 
	
	
		 
		 
		 
		
	
	
		
	


