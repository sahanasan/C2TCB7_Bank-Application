package com.tns.Framework;

public abstract class BankAcc
{
	protected int accNo;
	protected static String accNm;
	protected float accBal;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo=accNo;
	}
	
	public float getaccBal() {
		return accBal;
	}
	 public void setCharges(float accBal) {
		 this.accBal=accBal;
	 }
	 
	 public String getAccNm() {
		 return accNm;
	 }
	 public void setAccNm(String accNm) {
		 this.accNm=accNm;
	 }
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	 public void withdraw(float accBal) 
	 {
		 System.out.println("withdraw  and accBal are:" +accBal);
		 
	 }
	 public void deposite(float accBal)
	 {
		 System.out.println("deposit with accBal:"+ accBal);
		 
	 }
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + getAccNm() + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	
	 
}
