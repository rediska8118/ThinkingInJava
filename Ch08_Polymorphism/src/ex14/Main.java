package ex14;

import java.util.Random;

public class Main {
	static Random rand = new Random();

	static Rodent next(Shared shared) {

		switch (rand.nextInt(4)) {
		case 0:
			return new Mouse(shared);
		case 1:
			return new Hamster(shared);
		case 2:
			return new Gerbil(shared);

		default:
			return new Rodent();
		}
	}

	public static void main(String[] args) {

		Rodent[] rodents = new Rodent[10];
		Shared shared = new Shared();
		for (int i = 0; i < 10; i++)
			rodents[i] = next(shared);

		for (Rodent r : rodents) {
			// System.out.println(r);
			shared.finalize();
			r.dispose();
		}

		shared.finalize();

	}
}
