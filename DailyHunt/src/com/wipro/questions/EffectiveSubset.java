package com.wipro.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EffectiveSubset {

	public static void main(String[] args) {

		int[] set = { 24, 17, 66, 61, 32, 88, 94, 50, 97, 38, 86, 53, 83, 90, 20, 77, 41, 93, 26, 9, 69, 1, 39, 60, 7,
				45, 54, 28, 78, 96, 67, 95, 40, 18, 98, 0, 73, 23, 8, 36, 56, 11, 81, 31, 59, 46, 65, 30, 10, 52, 64,
				49, 35, 71, 14, 43, 68, 99, 13, 74, 89, 21, 5, 37, 29, 3, 85, 19, 62, 63, 92, 84, 82, 91, 44, 57, 79,
				25, 27, 34, 75, 4, 12, 2, 16, 22, 55, 42, 70, 76, 33, 87, 80, 51, 58, 72, 15, 48, 47, 6 };

//		List<List<Integer>> subset = subsets(set);
//
//		subset.forEach(subele -> {
//			System.out.println();
//			for (Integer sub : subele) {
//				System.out.println(sub);
//			}
//			System.out.println();
//		});
//
		int n = set.length;

		// Run a loop for printing all 2^n
		// subsets one by one
		 for (int i = 0; i < (1 << n); i++) {
		 System.out.print("{ ");
		
		 // Print current subset
		 for (int j = 0; j < n; j++)
		
		 // (1<<j) is a number with jth bit 1
		 // so when we 'and' them with the
		 // subset number we get which numbers
		 // are present in the subset and which
		 // are not
		 if ((i & (1 << j)) > 0)
		 System.out.print(set[j] + " ");
		
		 System.out.println("}");
		 }
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
