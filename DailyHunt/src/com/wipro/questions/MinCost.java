package com.wipro.questions;

public class MinCost {

	public static void main(String[] args) {

		String s = "abaac";// "abc";// "aabaa";
		int[] cost = { 1, 2, 3, 4, 5 };// { 1, 2, 3 };// { 1, 2, 3, 4, 1 };
		
		int max = -1, sum = 0;
		for (int i = 1; i < cost.length; i++) {
			if (s.charAt(i - 1) == s.charAt(i)) {
				sum += cost[i];
				System.out.println("sum = "+sum);
				if (max < cost[i]){
					sum -= max;
					max = cost[i];
					System.out.println("max = "+max);
				}
			}
		}

		System.out.println("Sum = " + sum);
	}

}
