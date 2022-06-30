package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Main {

	public static void main(String[] args) {


		ShopFactory shopObj = new GSShopFactory();


		PrimeAcc primeAccObj = new GSPrimeAcc(1234, "prime_account_name", 1000f, true);




		NormalAcc normalAccObj = new GSNormalAcc(5678, "normal_account_name", 10000f, NormalAcc.getDeliveryCharges());


		primeAccObj.bookProduct(5000.0f);
		normalAccObj.bookProduct(5000.0f);


		primeAccObj.toString();
		normalAccObj.toString();
	}
}