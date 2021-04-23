package com.wipro.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SubsetBackTrack {

	public static void main(String[] args) {

		SubsetBackTrack sbt = new SubsetBackTrack();
		int[] arr = {1,2,3};
		List<List<Integer>> subsets = sbt.subsets(arr);
		subsets.forEach(sub -> {
			for (Iterator iterator = sub.iterator(); iterator.hasNext();) {
				System.out.print(iterator.next()+" ");
			}
			System.out.println();
		});
	}

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
		list.add(new ArrayList<>(tempList));
		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}

}
