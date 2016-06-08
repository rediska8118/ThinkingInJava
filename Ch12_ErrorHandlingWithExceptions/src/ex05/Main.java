package ex05;

import java.util.Arrays;

public class Main {

	static int i = 5;
	static Object[] objects = new Object[3];

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println("Inside try before:"
						+ Arrays.toString(objects));
				objects[i] = i;
				System.out.println("Inside try after: "
						+ Arrays.toString(objects));

				break;

			} catch (Exception e) {
				System.err.println("Inside catch");
				e.printStackTrace();
				i--;
			} finally {
				System.out.println("Is it all?");

			}

		}
		System.out.println("That's all!");
	}
}
