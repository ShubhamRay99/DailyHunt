package com.wipro.questions;

public class LargestSubsetAnd {

	public static void main(String[] args) {
		int[] arr = { 16, 16 };// { 1, 2, 4, 8 };// { 13, 7, 2, 8, 3 };

		System.out.println(findLargestSubset(arr));
	}

	static int findLargestSubset(int... values) {
		if (values.length > 30)
			throw new IllegalArgumentException("Too many values");

		// Iterate all subsets (permutations), except the empty subset
		int maxSubsetSize = 0;
		int subsetCount = 1 << values.length;
		for (int subsetMask = 1; subsetMask < subsetCount; subsetMask++) {

			// 'AND' all values in the subset
			int result = -1; // all bits set
			for (int i = 0; i < values.length; i++)
				if ((subsetMask & (1 << i)) != 0) // value is in subset
					result &= values[i];

			// Check subset size if result is non-zero
			if (result != 0) {
				int subsetSize = Integer.bitCount(subsetMask);
				if (subsetSize > maxSubsetSize)
					maxSubsetSize = subsetSize;
			}
		}
		return maxSubsetSize;
	}
}
