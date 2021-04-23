package com.wipro.easy;

public class Race {

	public static void main(String[] args) {

		int[][] arr = 
		 { { 1, 3 }, { 2, 5 }, { 2, 4 }, { 3, 5 } };
//		{ { 1, 7 }, { 2, 4 }, { 6, 9 }, { 3, 8 }, { 5, 10 } };
		int max = Integer.MIN_VALUE;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				if (arr[j][i] > max) {
					max = arr[j][i];
				}
			}
		}

		// initialize result arr;
		int[] result = new int[max + 1];
		for (int i = 0; i < result.length; i++) {
			result[i] = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i][0]; j <= arr[i][1]; j++) {
				result[j]++;
			}

		}
		int maxx = Integer.MIN_VALUE;
		for (int i = 0; i < result.length; i++) {
			if (maxx < result[i])
				maxx = result[i];
		}
		System.out.println(maxx);
	}

}