package com.wipro.easy;

import java.util.Scanner;

public class TailHead {

	public static void main(String[] args) {

		/*
		 * H H H H H - initial {I, N, Q}-> {1, 5, 1} T H H H H - 1ST H T H H H -
		 * 2ND T H T H H - 3RD H T H T H - 4TH T H T H T - 5TH output = 2 (head)
		 * 3 (tail)
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		int testcases = sc.nextInt();
		int game = sc.nextInt();

		while (testcases-- > 0) {
			while (game-- > 0) {

				int[] INQ = new int[3];
				for (int i = 0; i < INQ.length; i++) {
					INQ[i] = sc.nextInt();
				}
				/*
				 * 5th - 0, 2, 4 iff I == Q 1, 3 else I != Q
				 */
				if (INQ[0] == INQ[2]) {
					int countEven = 0;
					while (INQ[1]-- > 0) {
						if (INQ[1] % 2 != 0)
							countEven++;
					}
					System.out.println(countEven);
				} else {
					int countOdd = 0;
					while (INQ[1]-- > 0) {
						if (INQ[1] % 2 == 0)
							countOdd++;
					}
					System.out.println(countOdd);
				}

			}
		}
	}

}
