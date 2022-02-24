package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc
{

	
	public static boolean isPrime;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
	}
	public void bookProduct(float charges)
	{
		System.out.println("charges are:" + charges);
	}
	
	@Override
	public String toString() {
		return "PrimeAcc [ isPrime=" + isPrime()+", accNo=" + getAccNo() + ", accNm=" +getAccNm() + ", charges=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
	
}


		
	
	
	