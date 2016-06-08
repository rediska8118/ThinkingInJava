package ex12;

import java.util.Random;

public class Main {
	static Random rand = new Random();

	static Rodent next() {

		switch (rand.nextInt(4)) {
		case 0:
			return new Mouse();
		case 1:
			return new Hamster();
		case 2:
			return new Gerbil();

		default:
			return new Rodent();
		}
	}

	public static void main(String[] args) {

		Rodent[] rodents = new Rodent[10];
		for (int i = 0; i < 10; i++)
			rodents[i] = next();

		for (Rodent r : rodents) {
			//System.out.println(r);
			r.dispose();
		}

	}
}
