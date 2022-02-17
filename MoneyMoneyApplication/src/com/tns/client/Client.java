package com.tns.client;

import com.tns.Application.MMBankFactory;
import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class Client {

	private static BankFactory factory;
	private static SavingAcc savingAcc;
	private static CurrentAcc currentAcc;

	public static void main(String[] args) {
		
		

		factory = new MMBankFactory();
		
		
		savingAcc = factory.getNewSavingAccount(1233, "qweer", 200000, true);
		savingAcc.withdraw(500000);
		System.out.println("Your Account balance is "+savingAcc.getAccBal());

		currentAcc = factory.getNewCurrentAccount(2315, "sahana", 50000, 100000);
		currentAcc.withdraw(2000);
		System.out.println("Your Account balance is "+currentAcc.getAccBal());
		
		System.out.println(currentAcc.toString());
		System.out.println(savingAcc.toString());
	}

}
	
	
	


	
	
		

	
	
	


	

		
		
	
			
			
		
	
	


		
	 
	
	
		 
		 
		 
		
	
	
		
	


