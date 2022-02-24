package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory 
{

	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(AccNo,accNm, charges, isPrime) ;
		return gsprime;
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo,accNm,charges,deliveryCharges);
		return gsnormal;
	}

	
}

