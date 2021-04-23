package com.wipro.questions;

public class AttachFive {
	public static void main(String[] args) {

		int n = 622;
		System.out.println(attach(n));
	}

	private static String attach(int n) {
		String num = String.valueOf(n);

		if (n < 0) {
			for (int i = 1; i < num.length(); i++) {

				if (Character.getNumericValue(num.charAt(i)) > 5) {
					num = num.substring(0, i) + "5" + num.substring(i, num.length());
					return num;
				}

			}
		}else {
			for (int i = 0; i < num.length(); i++) {

				if (Character.getNumericValue(num.charAt(i)) < 5) {
					num = num.substring(0, i) + "5" + num.substring(i, num.length());
					return num;
				}

			}
		}
		
		return num;
	}
}
