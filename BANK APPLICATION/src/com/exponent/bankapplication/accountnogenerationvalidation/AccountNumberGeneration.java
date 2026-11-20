package com.exponent.bankapplication.accountnogenerationvalidation;

public class AccountNumberGeneration {
	
	public static long generateAccountNo() {
		long generatedAccountNo=(long) (Math.random() * Math.pow(10, 12));
		return generatedAccountNo;
 	}

}
