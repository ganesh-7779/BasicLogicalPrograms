package com.bridgelabz;

public class StopWatch {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		clicks();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);

		printElapsedTime(startTime, endTime);

	}

	public static void clicks() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Clicks");
		}
	}

	private static void printElapsedTime(long startTime, long endTime) {
		System.out.println("Elapsed time in millisecond is: " + (endTime - startTime));

	}

}
