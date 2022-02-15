package com.tns.Application;

import com.tns.Framework.CurrentAcc;


public class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal,creditLimit);
	
		
}
	public void withdraw(float accBal)
	{
		float withdraw=25000;
		if(accBal>=withdraw) {
			System.out.println(accNo+" "+accNm+" "+"withdrawn:"+" "+ withdraw);
			accBal-=withdraw;
			System.out.println("balance after withdraw:"+accBal);}
		else {
			System.out.println(accNm+"you cannot withdraw"+withdraw);
			
		}
	}
	
		
	
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getAccNm()=" + getAccNm() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
	
