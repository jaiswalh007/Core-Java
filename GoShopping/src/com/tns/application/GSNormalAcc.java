package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

//	constructor
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}

	@Override
	public void bookProduct(float charges) {
//		System.out.println("UserName: " + ShopAcc.getAccNm() + "\n" + "Charges: " + charges + "\n"
//				+ "Delivery charges: " + getCharges());
		System.out.println("Dear Normal user, Your Charges are: " + getCharges() + " with Delivery charges is: "
				+ getDeliveryCharges());
	}

	@Override
	public String toString() {
		return super.toString();
	}

}