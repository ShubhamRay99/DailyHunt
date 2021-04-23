package com.wipro.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeanMedian {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };// { 1, 2, 3, 4 };// { 1, 2, 2, 3, 3 };//

		returnMaxMeanMedian(arr);

	}

	private static void returnMaxMeanMedian(int[] arr) {
		double max = -999.9;

		List<int[]> subArr = subSet(arr);

		int[] maxArr = new int[1];

		for (int[] sub : subArr) {

			double newMax = calcDiff(sub);

			if (max <= newMax) {
				max = newMax;
				maxArr = sub;
			}
		}
		System.out.println(Arrays.toString(maxArr));
	}

	private static double calcDiff(int[] sub) {
		// calc. mean
		double sum = 0;
		for (int i = 0; i < sub.length; i++) {
			sum += sub[i];
		}
		sum = sum / sub.length;

		// calc. median
		double median = 0;
		if (sub.length % 2 == 0)
			median = (double) (sub[(sub.length / 2) - 1] + sub[sub.length / 2]) / 2;
		else
			median = sub[sub.length / 2];

		double diff = sum - median;
		System.out.println(diff);
		return diff;
	}

	private static List<int[]> subSet(int[] arr) {
		List<int[]> subArr = new ArrayList<int[]>();

		int n = arr.length;

		// Run a loop until 2^n
		// subsets one by one
		for (int i = 0; i < (1 << n); i++) {

			String subSet = "";
			// Print current subset
			for (int j = 0; j < n; j++)

				if ((i & (1 << j)) > 0)
					subSet += arr[j] + " ";

			subArr.add(convertToInt(subSet.trim().split(" ")));
		}
		return subArr;
	}

	private static int[] convertToInt(String[] arr) {

		if (arr[0] == "")
			return new int[] { 0 };

		int[] intArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i].trim());
		}

		return intArr;
	}
}