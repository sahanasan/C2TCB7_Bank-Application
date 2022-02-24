package com.tns.framework;

public abstract class NormalAcc extends ShopAcc
{

	private final float deliveryCharge;
	
	
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge=50;
	}
	public void bookProduct(float deliveryCharge)
	{
		System.out.println("charges are:" + deliveryCharge);
		
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges=" + getCharges()
				+ charges + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
		
		
		public float getDeliveryCharge() {
		return deliveryCharge;
	}
	}
