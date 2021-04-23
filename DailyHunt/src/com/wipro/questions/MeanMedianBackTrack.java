package com.wipro.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeanMedianBackTrack {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 3 };
			
//			{ 1, 3, 7, 0, 1, 3, 4, 0, 6, 3, 8, 1, 0, 3, 7, 2, 7, 2, 1, 9, 3, 0, 0, 9, 4, 8, 6, 7, 8, 7, 7, 4, 4,
//				2, 3, 0, 4, 6, 8, 9, 4, 1, 3, 4, 0, 1, 4, 3, 9, 0, 0, 4, 4, 3, 8, 7, 1, 0, 5, 3, 5, 7, 4, 9, 9, 5, 4, 2,
//				7, 2, 2, 8, 2, 5, 9, 4, 0, 1, 1, 2, 6, 1, 5, 4, 1, 2, 6, 0, 2, 9, 8, 1, 9, 1, 4, 3, 0, 6, 1 };

		// { 1, 2, 3 };
		// { 1, 2, 3, 4 };
		// 
		// { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// int[] result =
		returnMeanMedianMax(arr);

	}

	private static int[] returnMeanMedianMax(int[] arr) {

		List<List<Integer>> subset = subsets(arr);
		List<Integer> maxSet = new ArrayList<>();
		double maxMedianDiff = -999;

		for (List<Integer> set : subset) {

			double meanMedianDiff = calcDiff(set);

			if (maxMedianDiff <= meanMedianDiff) {
				maxMedianDiff = meanMedianDiff;
				maxSet = set;
			}
			System.out.println("\nDiff = " + meanMedianDiff + " Arr = ");
			set.forEach(System.out::println);
		}

		System.out.println("\nMax Diff = " + maxMedianDiff);
		System.out.println("Max Arr = ");
		maxSet.forEach(System.out::print);

		return maxSet.stream().mapToInt(Integer::intValue).toArray();
	}

	private static double calcDiff(List<Integer> set) {

		int len = set.size();

		if (len < 1)
			return 0;

		double mean = 0;
		for (Integer s : set) {
			mean += s;
		}
		mean = mean / len; // calc. mean

		double median = 0;
		if (len % 2 == 0) // calc. median
			median = (double) (set.get(len / 2 - 1) + set.get(len / 2) / 2);
		else
			median = set.get(len / 2);

		System.out.println(mean + " + " + median);
		double diff = mean - median;
		return diff;
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
		list.add(new ArrayList<>(tempList));
		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
