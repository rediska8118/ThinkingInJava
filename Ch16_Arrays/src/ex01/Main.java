package ex01;

import java.util.Arrays;

public class Main {

	static void print(BerylliumSphere[] arr) {
		System.out.println(Arrays.asList(arr));
	}

	public static void main(String[] args) {
		print(new BerylliumSphere[] { new BerylliumSphere(),
				new BerylliumSphere() });
	}
}
