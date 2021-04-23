package com.wipro.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Lapindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {

			String str = sc.next();
			
			int len=str.length();
			String str1 = str.substring(0,(int)(len/2));
			String str2 = str.substring((int)Math.ceil(len/2),(int)(len));

			char[] char1 = new char[str1.length()];
			char[] char2 = new char[str2.length()];

			for (int j = 0; j < str1.length(); j++) {
				char1[j] = str1.charAt(j);
				char2[j] = str2.charAt(j);
			}

			Arrays.sort(char1);
			Arrays.sort(char2);

			if (Arrays.equals(char1, char2))
				System.out.println("Yes");
			else
				System.out.println("No");

		}
	}

}
