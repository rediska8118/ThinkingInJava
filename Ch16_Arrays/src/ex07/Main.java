package ex07;

import java.util.Arrays;
import static ex06.Main.*;

import ex01.BerylliumSphere;

public class Main {

	static BerylliumSphere[][][] create3Darr(int a, int b, int c) {
		BerylliumSphere[][][] berylliumSpheres = new BerylliumSphere[a][b][c];

		for (int j = 0; j < a; j++) {
			berylliumSpheres[j] = create2Darr(b, c);
		}
		return berylliumSpheres;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(create3Darr(2, 2, 2)));
	}
}
