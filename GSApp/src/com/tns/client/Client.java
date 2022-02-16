package com.tns.client;

import com.tns.application.*;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {

public static void main(String[] args) {
	ShopFactory Sp=new GSShopFactory();
	PrimeAcc Pa =new GSPrimeAcc(123,"nithin",1000,true);
	NormalAcc na=new GSNormalAcc(143,"sam",1000,50);
	Pa.bookProduct(0);
	na.bookProduct(50);
}
}
