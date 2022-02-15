package com.tns.client;

import com.tns.Application.MMBankFactory;
import com.tns.Application.MMCurrentAcc;
import com.tns.Application.MMSavingAcc;
import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;



public class Client{
	public static void main(String args[]) {
	BankFactory bf = new MMBankFactory();
	SavingAcc sa = new MMSavingAcc(209876,"sahana",1000,true);
	CurrentAcc ca = new MMCurrentAcc(23456,"nithin",3000,24000);
	sa.Deposite(3000);
	ca.withdraw(45000);
	ca.Deposite(40000);

	

	}
	
	
	
}

	
	
		

	
	
	


	

		
		
	
			
			
		
	
	


		
	 
	
	
		 
		 
		 
		
	
	
		
	


