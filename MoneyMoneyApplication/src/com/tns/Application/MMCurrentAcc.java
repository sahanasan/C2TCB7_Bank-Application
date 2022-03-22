package com.tns.Application;

import com.tns.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public void withdraw(float accBal) {
		
		System.out.println("Dear withdraw users , your accBal are:" + accBal);
	}
		

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MMCurrentAcc[]";
	}
}