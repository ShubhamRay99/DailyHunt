package com.wipro.easy;

public class Pattern {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0, k = 4; j < 3; j++) {
				if(j == (4-k))
					System.out.print(" * ");
				
				if(i < 2)
					k--;
				else
					k++;
			}
			System.out.println();
		}
	}
}
