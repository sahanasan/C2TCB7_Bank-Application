package com.tns.Framework;

public abstract class BankAcc {
	protected int accNo;
	protected String accNm;
	protected float accBal;
	private float withdraw;
	private float deposit;
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
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
		
		public void Deposite(float accBal)
	{
			float deposit=45000;
			System.out.println(accNm+"deposit:"+deposit);
			accBal+=deposit;
			System.out.println("balance after deposit:"+accBal);
	}
			
			
		
		
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
}
	
	
	
	


