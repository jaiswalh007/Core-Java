package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	private static final float charges = 0.0f;

//	constructor
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}

	public float getCharge() {
		return GSPrimeAcc.charges;
	}

	@Override
	public void bookProduct(float book) {
//		System.out.println("UserName: " + ShopAcc.getAccNm() + "\n" + "Charges: " + charges + "\n"
//				+ "Delivery charges: " + getCharges());

		System.out.println("Dear prime user, Your Charges are: " + getCharges());//shpAcc getCharged is called
	}

	@Override
	public String toString() {
		return super.toString();
	}

}