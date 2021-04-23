package com.wipro.backtracking;

public class GeekoNacci {

	/*
	 * Geek created a random series and given a name geek-onacci series. Given
	 * four integers A, B, C, N. A, B, C represents the first three numbers of
	 * geek-onacci series. Find the Nth number of the series. The nth number of
	 * geek-onacci series is a sum of the last three numbers (summation of
	 * N-1th, N-2th, and N-3th geek-onacci numbers)
	 */
	public static void main(String[] args) {

		
		int num = findGeekoNacci(1, 3, 2, 4, 0);
		System.out.println(num);
	}

	private static int findGeekoNacci(int i, int j, int k, int n, int sum) {

		if (n == 3)
			return sum;
		else
			sum += (i + j + k);
		return findGeekoNacci(j, k, sum, --n, sum);
	}

}
