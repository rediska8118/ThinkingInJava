package ex04;

public class Main {

	public static void main(String[] args) {
		int upperLimit = 100;

		for (int i = 1; i < upperLimit; i++) {
			int count = 0;
			for (int j = 1; j < upperLimit; j++) {
				if (i % j == 0)
					count++;
			}

			if (count <= 2)
				System.out.print(i + " ");
		}
	}
}
