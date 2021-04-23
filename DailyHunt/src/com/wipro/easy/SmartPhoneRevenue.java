package com.wipro.easy;

import java.util.Arrays;

public class SmartPhoneRevenue {

	public static void main(String[] args) {

		int count = 4;

		int[] customers = { 30, 20, 53, 14 };
		Arrays.sort(customers);

		long max = Long.MIN_VALUE;
		long revenue = 0;
		
		for (int i : customers) {
			revenue = (i * count--);
			if(revenue > max)
				max = revenue;
		}
		System.out.println(max);
	}

}
