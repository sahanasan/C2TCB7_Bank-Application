package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bookProduct(float deliverycharges)
	{
		System.out.println("Dear Normal User, your charges are:" +charges+"  with Delivery charges is:"+deliverycharges);
		
		

		
	}@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + getAccNo() + ", accNm=" + getAccNm() +", charges="+ getCharges() + ", toString()="+ super.toString() + ","
				+ " getAccNm()=" +getAccNm()+", getClass()=" +getClass()+", hashCode()="+ hashCode() +"]";
	}
}
		