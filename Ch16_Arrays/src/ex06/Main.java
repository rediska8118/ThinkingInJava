package ex06;

import java.util.Arrays;

import ex01.BerylliumSphere;

public class Main {

	public static BerylliumSphere[][] create2Darr(int a, int b) {
		BerylliumSphere[][] berylliumSpheres = new BerylliumSphere[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				berylliumSpheres[i][j] = new BerylliumSphere();
			}
		}
		return berylliumSpheres;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(create2Darr(2, 3)));
	}
}
