package ex02;

import java.util.Arrays;

import ex01.BerylliumSphere;

public class Main {

	static BerylliumSphere[] fillArr(int length) {
		BerylliumSphere[] spheres = new BerylliumSphere[length];
		
		for (int i = 0; i < length; i++)
			spheres[i] = new BerylliumSphere();

		return spheres;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.asList(fillArr(5)));
	}
}
