package com.wipro.easy;

public class DoubleTest {
 
	public static void main(String[] args) {

		double sum = 100;
		double price = 100;
		sum += (price >= 100)?price * 11:11;
		System.out.println(sum);
	}

}
