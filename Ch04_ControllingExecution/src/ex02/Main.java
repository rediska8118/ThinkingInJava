package ex02;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random1 = new Random();
		Random random2 = new Random();

		for (int i = 0; i < 25; i++) {
			int x = random1.nextInt(25);
			int y = random2.nextInt(25);

			if (x > y) {
				System.out.println(x + " > " + y);
			} else if (x < y) {
				System.out.println(x + " > " + y);
			} else{
				System.out.println(x + " = " + y);
			}
		}
	}

}
