package com.wipro.questions;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateArr {

	public static void main(String[] args) {

		ThreadLocalRandom.current().ints(0, 100).distinct().limit(100).forEach(no -> {
			System.out.print(no+", ");
		});
	}

}
