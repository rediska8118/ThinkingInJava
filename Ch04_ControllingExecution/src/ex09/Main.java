package ex09;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		printFibonacciNums(10);
	}

	static void printFibonacciNums(int upperLimit) {
		int[] arr = new int[upperLimit];

		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i < arr.length; i++) {

			arr[i] = arr[i - 2] + arr[i - 1];
		}

		System.out.println(Arrays.toString(arr));
	}

}
