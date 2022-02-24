package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopAcc;
import com.tns.framework.ShopFactory;


public class ClientTest 
{
	static ShopFactory sfobj;
	static GSPrimeAcc gsprimeobj;
	static GSNormalAcc gsnormalobj;
	
	public static void main(String[] args) 
	{
		
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(123, "nithin", 1000, true);
		gssfactory.getNewNormalAccount(123, "nithin2", 1000, 50);
		
		GSPrimeAcc gsprime = new GSPrimeAcc(101, "sahana", 700, true); 
			 gsprime.getAccNm();
			  gsprime.getAccNo(); 
			  gsprime.getCharges(); 
			  gsprime.bookProduct(1000);
			  gsprime.toString();
		GSNormalAcc gsnormal = new GSNormalAcc(101, "sahana", 700, 50); 
			 gsnormal.getAccNm();
			 gsnormal.getAccNo(); 
			 gsnormal.getCharges();
			 gsnormal.getDeliveryCharge();
			 gsnormal.bookProduct(1000); 
			 gsnormal.toString();
	}
}
			 
			 
			

	



