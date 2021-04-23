package com.wipro.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5 };
		int target = 8;
		
		List<List<Integer>> result = combinationSum(arr, target);
		result.forEach(arrays -> {
			arrays.forEach(System.out::println);
		});
		
	}

	private static List<List<Integer>> combinationSum(int[] arr, int target) {
		return findSum(arr, target, new ArrayList<>(), new ArrayList<Integer>());
	}

	private static List<List<Integer>> findSum(int[] arr, int target, ArrayList<ArrayList<Integer>> allList, ArrayList<Integer> subList) {

//		search on which basis ?
		
		return null;
	}
}
