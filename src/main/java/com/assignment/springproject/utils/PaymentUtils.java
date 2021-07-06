package com.assignment.springproject.utils;

import java.util.HashMap;
import java.util.Map;

import com.assignment.springproject.exception.InsufficientAmountException;

public class PaymentUtils {

	private static Map<String, Double> paymentMap = new HashMap<>();

	static {
		paymentMap.put("account1", 5000.0);
		paymentMap.put("account2", 3000.0);
		paymentMap.put("account3", 1000.0);
		paymentMap.put("account4", 800.0);
	}

	public static boolean checkCreditLimit(String accountNo, double paidAmount) {
		if (paidAmount > paymentMap.get(accountNo)) {
			throw new InsufficientAmountException("insufficient fund..!");
		} else {
			return true;
		}
	}

}
